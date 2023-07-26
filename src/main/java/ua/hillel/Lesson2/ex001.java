package ua.hillel.Lesson2;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number (or type 'exit'):");
            String input =  scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.print("BYE");
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    System.out.print("Even number");
                } else {
                    System.out.print("Old number");
                }
            } catch (NumberFormatException e){
                System.out.print("Invalid input, please enter valid number or 'exit'.");

                }
            }
        }
    }

