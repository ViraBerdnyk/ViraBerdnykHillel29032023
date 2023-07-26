package ua.hillel.Lesson3;

import java.util.Random;

public class Ex0003 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        //Заповнюємо масив випадковими числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        //Обчислюємо суму всіх єлементів в масиві
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = + arr[i];
        }
        // Обчислюємо середне арифметичне значення
        double average = (double) sum / arr.length;
        //Виводимо результат
        System.out.print("Масив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.print("\nСередне арифьетичне значення:" + average);

    }
}
