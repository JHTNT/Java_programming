public class Ch06_hw_08 {      // Class name: Student
    private int age;
    private int grade;
    private String name;

    public Ch06_hw_08() {      // Constructor name: Student
        this(20, 1, "NoName");
    }

    public Ch06_hw_08(int a, int g, String n) {
        age = a;
        grade = g;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int a) {
        boolean success = true;
        age = a;
        return success;
    }

    public int getGrade() {
        return grade;
    }

    public boolean setGrade(int g) {
        boolean success = true;
        grade = g;
        return success;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String n) {
        boolean success = true;
        name = n;
        return success;
    }

    public boolean setStudent() {
        boolean success = true;
        setStudent(20, 1, "NoName");
        return success;
    }

    public boolean setStudent(int g) {
        boolean success = true;
        setStudent(20, g, "NoName");
        return success;
    }

    public boolean setStudent(int a, int g, String n) {
        boolean success = true;
        age = a;
        grade = g;
        name = n;
        return success;
    }
}
