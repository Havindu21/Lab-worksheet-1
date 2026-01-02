package LW_05.Q1;

public class Book extends BorrowableItems{
    private String title;
    private String author;
    private String ISBN;

    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        super.setAvailable(true);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getAvailable() {
        return super.getAvailable();
    }

    public void setAvailable(Boolean available) {
        super.setAvailable(available);
    }

    @Override
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + ISBN);
        System.out.println("Availability : " + super.getAvailable());
    }
}