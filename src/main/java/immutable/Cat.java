package immutable;

public class Cat {
    private String breed;
    private String color;


    public Cat (String breed, String color){
        this.breed = breed;
        this.color = color;
    }

    public Cat setBreed(String breed) {
        Cat newCat = new Cat(breed, this.color);
        return newCat;
    }

    public Cat setColor(String color){
        Cat newCat = new Cat(this.breed, color);
        return newCat;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
}
