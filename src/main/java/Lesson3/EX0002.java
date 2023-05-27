package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class EX0002 {
    public static void main(String[] args) {
        int[] array = new int[10]; //новий масив з 10 елементів
        Random random = new Random();
        for (int i = 0; i < array.length ;i++) {
            array[1] = random.nextInt(100); // заповнюємо масив випадковими числами до 100
        }
        System.out.println("Початковий масив:" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) ;
            { // перевіряємо чи є число парним
                array[i] = 0; // якщо число парне змінюємо на 0

            }
        }
        System.out.println("Масив після зміни:" + Arrays.toString(array));
    }
}
