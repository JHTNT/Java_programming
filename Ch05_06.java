import java.util.Scanner;

public class Ch05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        String d1 = "", d2 = "";
        sc.close();

        for (int i = 0; i < s1.length(); i++) {
            d1 += s1.charAt(i) - 65;    // Ascii of 'A' is 65
        }
        for (int i = 0; i < s2.length(); i++) {
            d2 += s2.charAt(i) - 65;
        }
        System.out.print(Integer.valueOf(d1) + Integer.valueOf(d2));
    }
}
