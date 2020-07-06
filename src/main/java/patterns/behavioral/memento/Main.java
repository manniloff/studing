package patterns.behavioral.memento;

/**
 * Memento pattern -  позволяет сохранять и восстанавливать прошлые состояния объектов, не раскрывая подробностей их реализации.
 * <p>
 * Снимок на Java чаще всего реализуют с помощью сериализации. Но это не единственный,
 * да и не самый эффективный метод сохранения состояния объектов во время выполнения программы.
 * <p>
 * Примеры Снимка в стандартных библиотеках Java:
 * Все реализации java.io.Serializable могут быть использованы как аналог Снимка.
 * Все реализации javax.faces.component.StateHolder
 * <p>
 * В данном графическом редакторе мы можем менять цвет и позицию фигур. Пользователь может отменять или повторять действия, используя горячие клавиши.
 * <p>
 * Механизм отмены построен при помощи паттерна Снимок и Команды. Перед совершением команды, редактор сохраняет в истории снимок своего состояния.
 * Если нужно отменить команду, редактор берет последнюю запись из истории и восстанавливает состояние из снимка. Для последующей отмены берется команда дальше из истории.
 * <p>
 * Отмененные команды хранятся в истории пока пользователь не совершит какое-то действие. Это нужно, чтобы иметь возможность повторять отменённые команды.
 */

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.setContent("d");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
