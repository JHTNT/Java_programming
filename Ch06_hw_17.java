public class Ch06_hw_17 {       // Class name: Car
    int speed;
    int mileage;
    String color;
    String brand;

    public Ch06_hw_17() {       // Constructor name: Car
        this(0, 0, "NoColor", "NoBrand");
    }

    public Ch06_hw_17(int s) {
        this(s, 0, "NoColor", "NoBrand");
    }

    public Ch06_hw_17(String b) {
        this(0, 0, "NoColor", b);
    }

    public Ch06_hw_17(String c, String b) {
        this(0, 0, c, b);
    }

    public Ch06_hw_17(int s, int m, String c, String b) {
        speed = s;
        mileage = m;
        color = c;
        brand = b;
    }
}
