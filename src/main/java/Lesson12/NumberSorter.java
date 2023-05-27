package Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSorter {
    public static void main(String[] args) {
        List<Integer> originalCollection = generateRandomCollection(100);
        List<Integer> divisibleByTwo = new ArrayList<>();
        List<Integer> divisibleByThree = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();

        for (Integer number : originalCollection) {
            if (number % 2 == 0 && number % 3 == 0) {
                divisibleByTwo.add(number);
                divisibleByThree.add(number);
            } else if (number % 2 == 0) {
                divisibleByTwo.add(number);
            } else if (number % 3 == 0) {
                divisibleByThree.add(number);
            } else {
                otherNumbers.add(number);
            }
        }

        System.out.println("Original Collection:");
        printCollection(originalCollection);

        System.out.println("Divisible by 2:");
        printCollection(divisibleByTwo);

        System.out.println("Divisible by 3:");
        printCollection(divisibleByThree);

        System.out.println("Other Numbers:");
        printCollection(otherNumbers);
    }

    private static List<Integer> generateRandomCollection(int size) {
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt());
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

