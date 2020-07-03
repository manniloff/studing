package multithreading;

public class Consumer implements Runnable {
    @Override
    public void run() {
        do {
            System.out.println("Was consuming. Left " + Stock.queue.size());
        } while (Stock.queue.size() > 0);
    }
}
