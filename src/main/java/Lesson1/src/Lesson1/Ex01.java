package Lesson1.src.Lesson1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть температуру в градусах цельсія");
        double celsius = input.nextDouble();
        double fahrenheit =(5.0/9.0)* celsius +32.0;
        double kelvin = celsius +273.16;
        System.out.print(celsius +"C:"+fahrenheit+ "F:" + kelvin+ "K:");

    }
}


