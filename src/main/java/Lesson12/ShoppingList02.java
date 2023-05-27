package Lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ShoppingList02 {
    public static void main(String[] args) {
        Map<String, Integer> shoppingList = generateRandomShoppingList(10);
        System.out.println("Shopping List:");
        printShoppingList(shoppingList);
    }

    private static Map<String, Integer> generateRandomShoppingList(int size) {
        Map<String, Integer> shoppingList = new HashMap<>();
        Random random = new Random();
        String[] products = {"Apple", "Banana", "Orange", "Milk", "Bread", "Eggs", "Cheese", "Yogurt"};

        for (int i = 0; i < size; i++) {
            String randomProduct = products[random.nextInt(products.length)];
            int randomQuantity = random.nextInt(5) + 1; // Generate a random quantity between 1 and 5
            shoppingList.put(randomProduct, randomQuantity);
        }
        return shoppingList;
    }

    private static void printShoppingList(Map<String, Integer> shoppingList) {
        for (Map.Entry<String, Integer> entry : shoppingList.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + " - " + quantity);
        }
    }
}

