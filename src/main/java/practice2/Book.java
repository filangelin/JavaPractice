package practice2;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    void setAuthor(String author) {
       this.author = author;
    }

    String getAuthor() {
        return author;
    }

    void printInfo() {
        System.out.println("Книга - \"" + title + "\" Автор - " + author);
    }
}
