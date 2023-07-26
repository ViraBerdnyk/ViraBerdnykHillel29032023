package ua.hillel.Lesson12;

import java.util.*;

public class DuplicateRemover02 {
    public static void main(String[] args) {
        List<Integer> originalCollection = generateRandomCollection(100);
        List<Integer> uniqueElements = new ArrayList<>(new HashSet<>(originalCollection));

        System.out.println("Original Collection:");
        System.out.println(originalCollection);

        System.out.println("Collection with duplicates removed:");
        System.out.println(uniqueElements);

        int duplicateCount = originalCollection.size() - uniqueElements.size();
        System.out.println("Number of duplicates removed: " + duplicateCount);
    }

    private static List<Integer> generateRandomCollection(int size) {
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(50));
        }

        return collection;
    }
}









