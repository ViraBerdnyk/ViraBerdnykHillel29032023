package ua.hillel.Lesson12;

import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        List<Integer> originalCollection = generateRandomCollection(100);
        System.out.println("Original Collection:");
        printCollection(originalCollection);

        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicatesRemoved = new ArrayList<>();
        int duplicateCount = 0;

        for (Integer number : originalCollection) {
            if (uniqueElements.contains(number)) {
                duplicateCount++;
            } else {
                uniqueElements.add(number);
                duplicatesRemoved.add(number);
            }
        }

        System.out.println("Collection with duplicates removed:");
        printCollection(duplicatesRemoved);
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

    private static void printCollection(List<Integer> collection) {
        for (Integer number : collection) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}








