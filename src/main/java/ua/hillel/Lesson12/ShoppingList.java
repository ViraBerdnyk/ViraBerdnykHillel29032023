package ua.hillel.Lesson12;

import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        Random random = new Random();

        String[] products = {"Apple", "Banana", "Orange", "Milk", "Bread", "Eggs", "Cheese", "Yogurt"};

        for (int i = 0; i < 10; i++) {
            String randomProduct = products[random.nextInt(products.length)];
            int randomQuantity = random.nextInt(5) + 1;
            items.add(randomProduct);
            quantities.add(randomQuantity);
        }

        System.out.println("Shopping List:");
        int totalQuantity = 0;

        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            int quantity = quantities.get(i);
            System.out.println(item + " - " + quantity);
            totalQuantity += quantity;
        }

        System.out.println("Total quantity of items: " + totalQuantity);
    }
}

