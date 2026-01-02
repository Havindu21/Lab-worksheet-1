package LW_05.Q1;

abstract class BorrowableItems {
    private Boolean available;

    public abstract void displayInfo();

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}