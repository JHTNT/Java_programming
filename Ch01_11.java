import java.util.Scanner;

public class Ch01_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first, last;
        first = sc.next().toLowerCase();
        last = sc.next().toLowerCase();
        sc.close();

        first = first.substring(1) + first.substring(0, 1) + "ay";
        first = first.substring(0, 1).toUpperCase() + first.substring(1);
        last = last.substring(1) + last.substring(0, 1) + "ay";
        last = last.substring(0, 1).toUpperCase() + last.substring(1);
        System.out.print(first + " " + last);
    }
}
