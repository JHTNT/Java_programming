import java.util.Scanner;

public class Ch03_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        if (str.length() == 10 && Character.isLetter(str.charAt(0))
            && (str.charAt(1) == '1' || str.charAt(1) == '2')) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
