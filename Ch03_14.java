import java.util.Scanner;

public class Ch03_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        sc.close();

        s1 = s1.replaceAll("(?i)" + s2, s3);
        System.out.print(s1);
    }
}
