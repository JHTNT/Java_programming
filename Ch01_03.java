import java.util.Scanner;

public class Ch01_03 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        String myName;

        myName = keyin.next();
        keyin.close();
        System.out.print(myName);
    }
}
