package LW_05.Q1;

import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> BorrowableItemList = new ArrayList<>();

    public void addItem(BorrowableItems item) {
        if (item instanceof Book) {
            BorrowableItemList.add(item);
            System.out.println("Book " + ((Book) item).getTitle() + " successfully added");
        } else {
            System.out.println("Item type is not supported yet!!");
        }
    }

    public void checkOutBook(String title) {
        Boolean available = false;
        for (BorrowableItems item : BorrowableItemList) {
            if (item instanceof Book) {
                if (((Book) item).getTitle() == title) {
                    available = true;
                    if (((Book) item).getAvailable()) {
                        ((Book) item).setAvailable(false);
                        System.out.println("'" + ((Book) item).getTitle() + "' Successfully checked out!");
                    } else {
                        System.out.println("'" + ((Book) item).getTitle() + "' is not available!");
                    }
                }
            }
        }
        if (!available) {
            System.out.println("Specified Book can not be found!!");
        }
    }

    public void displayAllItems() {
        System.out.println("============");
        for (BorrowableItems item : BorrowableItemList) {
            item.displayInfo();
            System.out.println("============");
        }
    }

    public void displayAvailableItems() {
        System.out.println("============");
        for (BorrowableItems item : BorrowableItemList) {
            if (item.getAvailable()) {
                item.displayInfo();
                System.out.println("============");
            }
        }
    }

    public void displayLibraryInfo() {
        System.out.println("Number of items in the library : " + BorrowableItemList.size());
        int count = 0;
        for (BorrowableItems item : BorrowableItemList) {
            if (item.getAvailable()) {
                count++;
            }
        }
        System.out.println("Number of Available items in the library : " + count);
    }
}
