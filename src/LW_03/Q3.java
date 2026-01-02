package LW_03;

public class Q3 {
    public static void main(String[] args) {
        Owner owner = new Owner("Unknown", "Unknown");
        Bicycle bicycle = new Bicycle(owner);

        System.out.println("Owner name: " + bicycle.getOwner().getOwnerName());
        System.out.println("Phone no: " + bicycle.getOwner().getPhoneNo());

        bicycle.getOwner().setOwnerName("Havindu");
        bicycle.getOwner().setPhoneNo("0771234567");

        System.out.println("Updated owner name: " + bicycle.getOwner().getOwnerName());
        System.out.println("Updated phone no: " + bicycle.getOwner().getPhoneNo());
    }
}
