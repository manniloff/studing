package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String title;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscrie(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        subscribers.forEach(subscrier -> subscrier.update());
    }

    public void update(String title) {
        this.title = title;
        notifySubscribers();
    }
}
