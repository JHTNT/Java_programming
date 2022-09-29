import java.util.Scanner;

public class Ch03_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        sc.close();
        
        int result = s1.compareTo(s2);
        if (result > 0) {
            System.out.print(s1);
        } else if (result < 0) {
            System.out.print(s2);
        } else {
            System.out.print(0);
        }
    }
}
