import java.util.Scanner;

public class Ch07_hw_04 {
    public static final double PI = 3.14159;
    public static int invocationCount = 0;

    public static double area(double radius) {
        invocationCount++;
        return (PI * radius * radius);
    }

    public static double volume(double radius) {
        invocationCount++;
        return ((4.0 / 3.0) * PI * radius * radius * radius);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double radius = keyboard.nextDouble( );
        keyboard.close();
                      
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " +
             Ch07_hw_04.area(radius) + " square inches.");
        System.out.println("A sphere of radius " + radius + " inches");
        System.out.println("has an volume of " +
             Ch07_hw_04.volume(radius) + " cubic inches.");
        System.out.print("The method invocation count =" + invocationCount);
    }
}
