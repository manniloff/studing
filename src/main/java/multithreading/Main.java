package multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Insert number of producers\n");
        Integer producers = Integer.parseInt(reader.readLine());

        System.out.println("insert number of consumers\n");
        Integer consumers = Integer.parseInt(reader.readLine());

        for (int i = 0; i < producers; i++) {
            Thread thread = new Thread(new Producer());
            thread.setName("ConsumerThread" + i);
            thread.start();
        }

        for (int i = 0; i < consumers; i++) {
            Thread thread = new Thread(new Consumer());
            thread.setName("ConsumerThread" + 1);
            thread.start();
        }

        System.out.println("Was started " + producers + " producers threads and " + consumers + " consumers threads");
    }
}
