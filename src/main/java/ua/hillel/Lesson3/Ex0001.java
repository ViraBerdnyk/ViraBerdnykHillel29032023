package ua.hillel.Lesson3;

public class Ex0001 {
    public static void main(String[] args) {
        double degrees;
        double radians;
        double sinValue;
        for(int i =0; i <= 360; i +=10) {
            degrees = 1;
            radians = Math.toRadians(degrees);
            sinValue = Math.sin(radians);
            System.out.printf("sin(5.0f) = %.4f\n", degrees, sinValue);
        }
    }
}
