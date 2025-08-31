package practice3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    String getBookTitle() {
        return bookTitle;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getAuthor() {
        return author;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }

    void setCategory(String category) {
        this.category = category;
    }

    String getCategory() {
        return category;
    }

}
