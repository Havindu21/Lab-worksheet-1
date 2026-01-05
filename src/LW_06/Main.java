package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pet> allPets = new ArrayList<>();
    static ArrayList<Dog> dogList = new ArrayList<>();
    static ArrayList<Cat> catList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("\n--- Pet Menu ---");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("5. Show All & Stats");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCat();
                    break;
                case 2:
                    addDog();
                    break;
                case 3:
                    removeCat();
                    break;
                case 4:
                    removeDog();
                    break;
                case 5:
                    displayData();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }


    public static void addCat() {
        System.out.print("Enter Cat Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Coat Color: ");
        String color = scanner.nextLine();

        Cat newCat = new Cat();
        newCat.setName(name);
        newCat.setCoatColor(color);

        allPets.add(newCat);
        catList.add(newCat);
        System.out.println("Cat added!");
    }


    public static void addDog() {
        System.out.print("Enter Dog Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        Dog newDog = new Dog();
        newDog.setName(name);
        newDog.setWeight(weight);

        allPets.add(newDog);
        dogList.add(newDog);
        System.out.println("Dog added!");
    }


    public static void removeCat() {
        System.out.print("Enter Cat Name to remove: ");
        String name = scanner.nextLine();


        allPets.removeIf(p -> p instanceof Cat && p.getName().equalsIgnoreCase(name));

        catList.removeIf(c -> c.getName().equalsIgnoreCase(name));

        System.out.println("Operation complete.");
    }


    public static void removeDog() {
        System.out.print("Enter Dog Name to remove: ");
        String name = scanner.nextLine();

        allPets.removeIf(p -> p instanceof Dog && p.getName().equalsIgnoreCase(name));
        dogList.removeIf(d -> d.getName().equalsIgnoreCase(name));

        System.out.println("Operation complete.");
    }


    public static void displayData() {
        System.out.println("\n--- Cats ---");
        for (Cat c : catList) {
            System.out.println("Name: " + c.getName() + ", Color: " + c.getCoatColor()); // [cite: 33]
        }

        System.out.println("\n--- Dogs ---");
        for (Dog d : dogList) {
            System.out.println("Name: " + d.getName() + ", Weight: " + d.getWeight()); // [cite: 33]
        }


        if (!dogList.isEmpty()) {
            double sum = 0;
            double min = dogList.get(0).getWeight();
            double max = dogList.get(0).getWeight();

            for (Dog d : dogList) {
                double w = d.getWeight();
                sum += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }
            double avg = sum / dogList.size();

            System.out.println("\n--- Dog Stats ---");
            System.out.println("Average Weight: " + avg);
            System.out.println("Min Weight: " + min);
            System.out.println("Max Weight: " + max);
        } else {
            System.out.println("\nNo dogs to calculate stats.");
        }
    }
}
