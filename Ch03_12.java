import java.util.Scanner;

public class Ch03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next().toLowerCase();
        String last = sc.next().toLowerCase();
        sc.close();

        first = first.substring(1, 2).toUpperCase() + first.substring(2)
                + first.substring(0, 1) + "ay";
        last = last.substring(last.length() - 1).toUpperCase()
               + last.substring(0, last.length() - 1) + "er";
        System.out.print(first + " " + last);
    }
}