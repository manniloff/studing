package patterns.behavioral.observer.depricated;

public class Main {

    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Blog programmingBlog = new Blog();
        Blog flowerBlog = new Blog();

        programmingBlog.addObserver(sub1);
        programmingBlog.addObserver(sub2);
        flowerBlog.addObserver(sub2);

        programmingBlog.setArticle("Java tutorial");
        programmingBlog.notifyObservers(programmingBlog.getArticle());
        flowerBlog.setArticle("New Flowers!!!");
        flowerBlog.notifyObservers(flowerBlog.getArticle());
    }
}