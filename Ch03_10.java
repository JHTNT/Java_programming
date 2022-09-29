import java.util.Scanner;

public class Ch03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine(), s3 = sc.nextLine();
        sc.close();

        System.out.print(s1.replace(s2, s3));
    }
}
