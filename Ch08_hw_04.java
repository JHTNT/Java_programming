import java.util.Scanner;

public class Ch08_hw_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(), key = sc.next().toUpperCase();
        sc.close();

        int i = 0, j = 0;
        while (i < str.length() && j < key.length()) {
            if (str.charAt(i) == key.charAt(j)) j++;
            i++;
        }

        if (j == key.length()) {
            System.out.print("Y");
        } else {
            System.out.print("N");
        }
    }
}
