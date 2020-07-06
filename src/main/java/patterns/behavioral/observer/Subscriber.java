package patterns.behavioral.observer;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + name + " ,video from channel was updated!!!");
    }
}
