package LW_03;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        Library library = new Library();
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        library.displayLibraryInfo();

        System.out.println("\nAvailable items:");
        library.listAvailableItems();

        System.out.println("\nChecking out: Island of a Thousand Mirrors");
        library.checkoutItem("Island of a Thousand Mirrors");

        System.out.println("\nAvailable items after checkout:");
        library.listAvailableItems();
    }

    public static abstract class BorrowableItems {
        public abstract void displayInfo();
    }

    public static class Book extends BorrowableItems {
        private String title;
        private String author;
        private String ISBN;
        private boolean available;

        public Book(String title, String author, String ISBN, boolean available) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.available = available;
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

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        @Override
        public void displayInfo() {
            System.out.println(
                    "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + available
            );
        }
    }

    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Student extends Person {
        public Student(String name) {
            super(name);
        }
    }

    public static class Library {
        private final List<BorrowableItems> borrowableItemsList = new ArrayList<>();

        public void addLibraryItem(BorrowableItems item) {
            borrowableItemsList.add(item);
        }

        public void checkoutItem(String title) {
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book book) {
                    if (book.getTitle().equalsIgnoreCase(title)) {
                        book.setAvailable(false);
                        return;
                    }
                }
            }
            System.out.println("Item not found: " + title);
        }

        public void listAvailableItems() {
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book book && book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }

        public void displayLibraryInfo() {
            int availableCount = 0;
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book book && book.isAvailable()) {
                    availableCount++;
                }
            }

            System.out.println("Total items: " + borrowableItemsList.size());
            System.out.println("Available items: " + availableCount);
        }
    }
}
