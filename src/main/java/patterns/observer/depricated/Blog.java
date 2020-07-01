package patterns.observer.depricated;

import java.util.Observable;

public class Blog extends Observable {

    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
        setChanged();
    }
}
