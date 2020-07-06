package patterns.behavioral.observer;

/**
 * Observer pattern - создаёт механизм подписки, позволяющий одним объектам следить и реагировать на события, происходящие в других объектах.
 * <p>
 * Наблюдатель можно часто встретить в Java коде, особенно там, где применяется событийная модель отношений между компонентами.
 * Наблюдатель позволяет отдельным компонентам реагировать на события, происходящие в других компонентах.
 * <p>
 * Примеры Наблюдателя в стандартных библиотеках Java:
 * java.util.Observer/java.util.Observable (редко используется в реальной жизни)
 * Все реализации java.util.EventListener (практически во всём Swing-е)
 * javax.servlet.http.HttpSessionBindingListener
 * javax.servlet.http.HttpSessionAttributeListener
 * javax.faces.event.PhaseListener
 * <p>
 * В этом примере Наблюдатель используется для передачи событий между объектами текстового редактора.
 * Всякий раз когда объект редактора меняет своё состояние, он оповещает своих наблюдателей.
 * Объекты EmailNotificationListener и LogOpenListener следят за этими уведомлениями и выполняют полезную работу в ответ.
 * <p>
 * Классы подписчиков не связаны с классом редактора и могут быть повторно использованы в других приложениях если потребуется.
 * Класс Editor зависит только от общего интерфейса подписчиков. Это позволяет добавлять новые типы подписчиков не меняя существующего кода редактора.
 */
public class Main {
    public static void main(String[] args) {
        YoutubeChannel radut = new YoutubeChannel();

        Subscriber sub1 = new Subscriber("Sergey");
        Subscriber sub2 = new Subscriber("Olga");
        Subscriber sub3 = new Subscriber("Andrew");
        Subscriber sub4 = new Subscriber("Oleg");
        Subscriber sub5 = new Subscriber("Nastea");

        radut.subscribe(sub1);
        radut.subscribe(sub2);
        radut.subscribe(sub3);
        radut.subscribe(sub4);
        radut.subscribe(sub5);

        /*sub1.subscribeYoutubeChannel(radut);
        sub2.subscribeYoutubeChannel(radut);
        sub3.subscribeYoutubeChannel(radut);
        sub4.subscribeYoutubeChannel(radut);
        sub5.subscribeYoutubeChannel(radut);*/

        radut.update("Test video");
    }
}
