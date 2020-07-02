package patterns.behavioral.observer;

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
