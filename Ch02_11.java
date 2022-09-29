import java.util.Scanner;

public class Ch02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        sc.close();

        System.out.print(str1 + str2 + str3);
    }
}
