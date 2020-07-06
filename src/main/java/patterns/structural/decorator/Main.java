package patterns.structural.decorator;

import patterns.structural.decorator.decorators.*;

/**
 * Decorator pattern - позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные «обёртки».
 *
 * Декоратор позволяет оборачивать объекты бесчисленное количество раз благодаря тому, что и обёртки, и реальные оборачиваемые объекты имеют общий интерфейс.
 *
 * Паттерн можно часто встретить в Java-коде, особенно в коде, работающем с потоками данных.
 *
 * Примеры Декораторов в стандартных библиотеках Java:
 * Все подклассы java.io.InputStream, OutputStream, Reader и Writer имеют конструктор, принимающий объекты этих же классов.
 * java.util.Collections, методы checkedXXX(), synchronizedXXX() и unmodifiableXXX().
 * javax.servlet.http.HttpServletRequestWrapper и HttpServletResponseWrapper
 *
 * Пример показывает, как можно добавить новую функциональность объекту, не меняя его класса.
 * Сначала класс бизнес-логики мог считывать и записывать только чистые данные напрямую из/в файлы.
 * Применив паттерн Декоратор, мы создали небольшие классы-обёртки, которые добавляют новые поведения до или после основной работы вложенного объекта бизнес-логики.
 * Первая обёртка шифрует и расшифрует данные, а вторая — сжимает и распакует их.
 * Мы можем использовать обёртки как отдельно друг от друга, так и все вместе, обернув один декоратор другим.
 */
public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
