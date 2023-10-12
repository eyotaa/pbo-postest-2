package main;

import java.util.Scanner;
import billiardstore.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+-------------------------+");
            System.out.println("Welcome to Billiard Store");
            System.out.println("+-------------------------+");
            System.out.println("1. Display Items");
            System.out.println("2. Add Items Billiard");
            System.out.println("3. Remove Items Billiard");
            System.out.println("4. Update Items Billiard");
            System.out.println("5. Exit");
            System.out.println("+-------------------------+");

            System.out.print(">> Choose menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    BilliardStore.displayItems();
                    break;
                case 2:
                    System.out.println("Choose item type (Cue/Glove): ");
                    String itemType = scanner.nextLine().toLowerCase();
                    if ("cue".equalsIgnoreCase(itemType)) {
                        System.out.print("Enter the ID Cue: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter the name Cue: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the price Cue: ");
                        int price = scanner.nextInt();
                        System.out.print("Enter the length: ");
                        int length = scanner.nextInt();
                        System.out.print("Enter the weight: ");
                        int weight = scanner.nextInt();
                        scanner.nextLine();

                        Cue item = new Cue(id, name, price, length, weight);
                        BilliardStore.addItemCue(item);
                    } else if ("glove".equalsIgnoreCase(itemType)) {
                        System.out.print("Enter the ID Glove: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter the name Glove: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the price Glove: ");
                        int price = scanner.nextInt();
                        System.out.print("Enter the size: ");
                        String size = scanner.nextLine();
                        System.out.print("Enter the color: ");
                        String color = scanner.nextLine();

                        Glove item = new Glove(id, name, price, size, color);
                        BilliardStore.addItemGlove(item);
                    } else {
                        System.out.println("Invalid item type. Use 'Cue' or 'Glove'.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the item type (Cue/Glove): ");
                    String itemTypeToRemove = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the ID to remove: ");
                    String idToRemove = scanner.nextLine();
                    if ("cue".equalsIgnoreCase(itemTypeToRemove)) {
                        BilliardStore.removeItemByIdCue(idToRemove);
                        System.out.println("Removed item by ID Cue");
                    } else if ("glove".equalsIgnoreCase(itemTypeToRemove)) {
                        BilliardStore.removeItemByIdGlove(idToRemove);
                        System.out.println("Removed item by ID Glove");
                    } else {
                        System.out.println("Invalid item type. Use 'Cue' or 'Glove'.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the item type (Cue/Glove): ");
                    String itemTypeToUpdate = scanner.nextLine().toLowerCase();
                    System.out.print("Enter the ID to update: ");
                    String idToUpdate = scanner.nextLine();
                    System.out.print("Enter the new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter the new price: ");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine();
                    if ("cue".equalsIgnoreCase(itemTypeToUpdate)) {
                        System.out.print("Enter the new length: ");
                        int newLength = scanner.nextInt();
                        System.out.print("Enter the new weight: ");
                        int newWeight = scanner.nextInt();
                        BilliardStore.updateItemByIdCue(idToUpdate, newName, newPrice, newLength, newWeight);
                    } else if ("glove".equalsIgnoreCase(itemTypeToUpdate)) {
                        System.out.println("Enter the new size: ");
                        String newSize = scanner.nextLine();
                        System.out.println("Enter the new color: ");
                        String newColor = scanner.nextLine();
                        BilliardStore.updateItemByIdGlove(idToUpdate, newName, newPrice, newSize, newColor);
                    } else {
                        System.out.println("Invalid item type. Use 'Cue' or 'Glove'.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Billiard Store. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
