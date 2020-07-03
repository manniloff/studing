package multithreading;

public class Producer implements Runnable{
    @Override
    public void run() {
        do{
            System.out.println("Was produced. In stock " +Stock.queue.size());
        }while (true);
    }
}
