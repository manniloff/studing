package patterns.creational.factory;

/**
 * Factory method pattern - определяет общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
 * <p>
 * Паттерн можно часто встретить в любом Java-коде, где требуется гибкость при создании продуктов.
 * <p>
 * Паттерн широко используется в стандартных библиотеках Java:
 * java.util.Calendar#getInstance()
 * java.util.ResourceBundle#getBundle()
 * java.text.NumberFormat#getInstance()
 * java.nio.charset.Charset#forName()
 * java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Возвращает разные объекты-одиночки, в зависимости от протокола)
 * java.util.EnumSet#of()
 * javax.xml.bind.JAXBContext#createMarshaller() и другие похожие методы.
 */

public class Main {
    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();

        Doughnut cherry = factory.getDoughnut(DoughnutTypes.CHERRY);
        // Doughnut chocolate = factory.getDoughnut(DoughnutTypes.CHOCOLATE);
        // Doughnut almond = factory.getDoughnut(DoughnutTypes.ALMOND);

        cherry.eat();
        //chocolate.eat();
        // almond.eat();

        RandomDoughnut randomDoughnut = new RandomDoughnut();

        randomDoughnut.getRandomDoughut(factory);
    }
}
