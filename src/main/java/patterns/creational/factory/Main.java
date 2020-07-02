package patterns.creational.factory;


public class Main {
    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();

        Doughnut cherry = factory.getDoughnut(DoughnutTypes.CHERRY);
       // Doughnut chocolate = factory.getDoughnut(DoughnutTypes.CHOCOLATE);
       // Doughnut almond = factory.getDoughnut(DoughnutTypes.ALMOND);

        cherry.eat();
        //chocolate.eat();
       // almond.eat();

        RandomDoughnut randomDoughnut = new RandomDoughnut();

        randomDoughnut.getRandomDoughut(factory);
    }
}
