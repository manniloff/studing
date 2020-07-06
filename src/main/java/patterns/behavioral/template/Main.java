package patterns.behavioral.template;

import patterns.behavioral.template.networks.Facebook;
import patterns.behavioral.template.networks.Network;
import patterns.behavioral.template.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Демо-класс. Здесь всё сводится воедино.
 *
 * Template method pattern - определяет скелет алгоритма, перекладывая ответственность за некоторые его шаги на подклассы.
 * Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.
 *
 * Примеры Шаблонных методов в стандартных библиотеках Java:
 * Все не-абстрактные методы классов java.io.InputStream, java.io.OutputStream, java.io.Reader и java.io.Writer.
 * Все не-абстрактные методы классов java.util.AbstractList, java.util.AbstractSet и java.util.AbstractMap.
 * javax.servlet.http.HttpServlet, все методы doXXX() по умолчанию возвращают HTTP-код 405 "Method Not Allowed". Однако вы можете переопределить их при желании.
 *
 * Социальные сети предоставляют собственные методы API для авторизации, постинга и выхода, но общий процесс для всех сетей совпадает.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Вводим сообщение.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Создаем сетевые объекты и публикуем пост.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
