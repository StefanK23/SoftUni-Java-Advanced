package First;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private int  year;
    private List<String> authors;

    public Book(String title,int year,String...authors ){
       this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);

    }

    public void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        for (String author : authors) {
            this.authors.add(author);
        }
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
