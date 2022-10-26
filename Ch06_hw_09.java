public class Ch06_hw_09 {       // Class name: Car
    int speed;
    int mileage;
    String color;
    String brand;

    public Ch06_hw_09() {       // Constructor name: Car
        this(0, 0, "NoColor", "NoBrand");
    }

    public Ch06_hw_09(int s, int m, String c, String b) {
        speed = s;
        mileage = m;
        color = c;
        brand = b;
    }

    public int getSpeed() {
        return speed;
    }
    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public boolean setSpeed(int s) {
        boolean success = true;
        speed = s;
        return success;
    }
    public boolean setMileage(int m) {
        boolean success = true;
        mileage = m;
        return success;
    }

    public boolean setColor(String c) {
        boolean success = true;
        color = c;
        return success;
    }

    public boolean setBrand(String b) {
        boolean success = true;
        brand = b;
        return success;
    }

    public boolean setCar(String color, String brand) {
        boolean success = true;
        setCar(0, 0, color, brand);
        return success;
    }

    public boolean setCar(int s, int m, String c, String b) {
        boolean success = true;
        speed = s;
        mileage = m;
        color = c;
        brand = b;
        return success;
    }

    public boolean setColor(String color, String brand) {
        boolean success = true;
        setCar(0, 0, color, brand);
        return success;
    }

    public boolean setColor(int s, int m, String c, String b) {
        boolean success = true;
        speed = s;
        mileage = m;
        color = c;
        brand = b;
        return success;
    }
}
