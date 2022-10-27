public class Ch06_hw_14 {      // Class name: Student
    public int age;
    public int grade;
    public String name;
    public String id;

    public Ch06_hw_14() {      // Constructor name: Student
        this(20, 1, "NoName", "ACS001");
    }

    public Ch06_hw_14(int age) {
        this(age, 1, "NoName", "ACS001");
    }

    public Ch06_hw_14(String name) {
        this(20, 1, name, "ACS001");
    }

    public Ch06_hw_14(int a, int g, String n, String i) {
        age = a;
        grade = g;
        name = n;
        id = i;
    }
}
