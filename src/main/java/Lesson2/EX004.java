package Lesson2;

public class EX004 {
    public static void main(String[] args) {
        int x = 3;
        int y = -9;

        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > absY) {
            System.out.print("Asolute value of" + x + "is greater than absolute value of" + y);
        } else if (absY > absX) {
            System.out.print("Asolute value of" + y + "is greater than absolute value of" + x);
        } else  {
            System.out.print("Absolute value of both numbers are equal");
        }
    }
}
