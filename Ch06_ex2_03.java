public class Ch06_ex2_03 {      // Class name: Student
    private int grade;
    private String name;

    public Ch06_ex2_03() {      // Constructor name: Student
        this(1, "NoName");
    }

    public Ch06_ex2_03(int g, String n) {
        grade = g;
        name = n;
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
}
