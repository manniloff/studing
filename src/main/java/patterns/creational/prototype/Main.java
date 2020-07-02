package patterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();

        bookShop.setShopName("#1");
        bookShop.getBooksData();
        bookShop.getBooks().remove(1);

        System.out.println(bookShop);

        BookShop bookShop1 = (BookShop) bookShop.clone();
        bookShop1.setShopName("#2");

        System.out.println(bookShop1);

        BookShop bookShop2 = bookShop.cloneShop();
        bookShop2.setShopName("#3");

        System.out.println(bookShop2);
    }
}
