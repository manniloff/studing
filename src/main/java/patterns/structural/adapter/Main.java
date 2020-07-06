package patterns.structural.adapter;

import patterns.structural.adapter.adapters.SquarePegAdapter;
import patterns.structural.adapter.round.RoundHole;
import patterns.structural.adapter.round.RoundPeg;
import patterns.structural.adapter.square.SquarePeg;

/**
 * Adapter pattern - позволяет объектам с несовместимыми интерфейсами работать вместе.
 * <p>
 * Паттерн можно часто встретить в Java-коде, особенно там, где требуется конвертация разных типов данных или совместная работа классов с разными интерфейсами.
 * <p>
 * Примеры Адаптеров в стандартных библиотеках Java:
 * java.util.Arrays#asList()
 * java.util.Collections#list()
 * java.util.Collections#enumeration()
 * java.io.InputStreamReader(InputStream) (возвращает объект Reader)
 * java.io.OutputStreamWriter(OutputStream) (возвращает объект Writer)
 * javax.xml.bind.annotation.adapters.XmlAdapter#marshal() и #unmarshal()
 * <p>
 * Этот простой пример показывает как с помощью паттерна Адаптер можно совмещать несовместимые вещи.
 */
public class Main {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
