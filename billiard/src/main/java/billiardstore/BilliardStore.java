package billiardstore;

import java.util.ArrayList;

public class BilliardStore {
    private static final ArrayList<Cue> itemsCue = new ArrayList<>();
    private static final ArrayList<Glove> itemsGlove = new ArrayList();

    public static void addItemCue(Cue item) {
        itemsCue.add(item);
    }

    public static void addItemGlove(Glove item) {
        itemsGlove.add(item);
    }

    public static void displayItemsCue() {
        System.out.println("Cue Items:");
        for (Cue item : itemsCue) {
            item.displayItem();
        }
    }

    public static void displayItemsGlove() {
        System.out.println("Glove Items:");
        for (Glove item : itemsGlove) {
            item.displayItem();
        }
    }

    public static void displayItems() {
        displayItemsCue();
        displayItemsGlove();
    }

    public static void removeItemByIdCue(String id) {
        BilliardItem itemToRemove = null;
        for (Cue item : itemsCue) {
            if (item.getIdItem().equals(id)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            itemsCue.remove(itemToRemove);
            System.out.println("Item with ID " + id + " has been removed from Cue items.");
        } else {
            System.out.println("Item with ID " + id + " not found in Cue items.");
        }
    }

    public static void updateItemByIdCue(String id, String name, int price, int length, int weight) {
        for (Cue item : itemsCue) {
            if (item.getIdItem().equals(id)) {
                item.setName(name);
                item.setPrice(price);
                item.setLength(length);
                item.setWeight(weight);
                System.out.println("Item with ID " + id + " has been updated.");
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found in Cue items.");
    }

    public static void removeItemByIdGlove(String id) {
        BilliardItem itemToRemove = null;
        for (Glove item : itemsGlove) {
            if (item.getIdItem().equals(id)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            itemsGlove.remove(itemToRemove);
            System.out.println("Item with ID " + id + " has been removed from Glove items.");
        } else {
            System.out.println("Item with ID " + id + " not found in Glove items.");
        }
    }

    public static void updateItemByIdGlove(String id, String name, int price, String size, String color) {
        for (Glove item : itemsGlove) {
            if (item.getIdItem().equals(id)) {
                item.setName(name);
                item.setPrice(price);
                item.setSize(size);
                item.setColor(color);
                System.out.println("Item with ID " + id + " has been updated.");
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found in Glove items.");
    }
}
