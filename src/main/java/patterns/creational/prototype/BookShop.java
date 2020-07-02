package patterns.creational.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList();

    public void getBooksData(){
        books.add(new Book("First","FirstAuth", 100));
        books.add(new Book("Second","SecondAuth", 30));
        books.add(new Book("Third","ThirdAuth", 110));
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         return super.clone();
    }

    protected BookShop cloneShop() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for (Book b : getBooks()){
            shop.getBooks().add(b);
        }

        return shop;
    }
}
