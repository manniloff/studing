package immutable;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("1","red");

        Cat cat2 = new Cat("2", "blue");

        Cat cat3 = cat1.setBreed("3");

        Cat cat4 = cat2.setColor("green");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
    }
}
