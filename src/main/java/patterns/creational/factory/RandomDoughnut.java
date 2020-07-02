package patterns.creational.factory;

import java.util.Random;

public class RandomDoughnut implements Doughnut {


    public void getRandomDoughut(DoughnutFactory factory) {
        factory.getDoughnut(getRandomDoughutType()).eat();
    }

    public DoughnutTypes getRandomDoughutType() {
        Random random = new Random();
        DoughnutTypes types = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];
        return types;
    }

    public void eat() {
        System.out.println("You are eating random doughnut ");
    }
}
