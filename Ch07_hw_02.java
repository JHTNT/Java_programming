public class Ch07_hw_02 {       // Class name: RoundStuff
    public static final double PI = 3.14159;

    public static double area(double radius) {
        return (PI*radius*radius);
    }

    public static double volume(double radius) {
        return ((4.0 / 3.0) * PI * radius * radius * radius);
    }

    public static double circumference(double radius) {
        return (2.0 * PI * radius);
    }

    public static double surfacearea(double radius) {
        return (4.0 * PI * radius * radius);
    }
}