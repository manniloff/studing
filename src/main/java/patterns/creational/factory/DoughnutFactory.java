package patterns.creational.factory;

public class DoughnutFactory {

    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut result = null;

        switch (type) {
            case CHERRY:
                result = new CherryDoughnut();
                break;
            case ALMOND:
                result = new AlmondDoughnut();
                break;
            case CHOCOLATE:
                result = new CherryDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return result;
    }

}
