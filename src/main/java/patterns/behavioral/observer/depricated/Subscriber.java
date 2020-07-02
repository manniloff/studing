package patterns.behavioral.observer.depricated;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        System.out.println("New article is been created " + arg);
    }
}
