package LW_05.Q1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("9789553023975", "Sujatha Thilaka", "Seena Maragatham");
        Book book2 = new Book("9789553548721", "Seynamasasekaka", "Nuramakadya Bauthika Nuladanayakshanamaala");
        Book book3 = new Book("9781616953623", "Nayomi Munaweera", "Island of a Thousand Mirrors");

        Library library = new Library();

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        System.out.println("\nLibrary information : ");
        library.displayLibraryInfo();
        System.out.println("\nAvailable items");
        library.displayAvailableItems();

        library.checkOutBook("Island of a Thousand Mirrors");

        System.out.println("\nLibrary information : ");
        library.displayLibraryInfo();
        System.out.println("\nAvailable items");
        library.displayAvailableItems();
        System.out.println("\nAll items");
        library.displayAllItems();
    }
}
