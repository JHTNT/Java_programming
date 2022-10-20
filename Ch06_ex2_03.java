public class Ch06_ex2_03 {      // class name 與 file name 改為 Student
    private int grade;
    private String name;

    public Ch06_ex2_03() {      // Constructor
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
