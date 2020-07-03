package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Stock {
    public static Queue<Product> queue = new LinkedList<>();

    public synchronized void produce() throws InterruptedException {
        while (queue.size() < 100) {
            wait();
        }
        Product product = new Product();
        product.setName("test");
        product.setPrice(10d);

        queue.add(product);

        notify();
        Thread.sleep(1000);
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.size() == 0) {
            wait();
        }

        queue.peek();
        notify();
        Thread.sleep(1000);
    }
}
