import java.util.Scanner;

public class Ch02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        sc.close();

        Scanner s = new Scanner(s1).useDelimiter(s2 + "|\n");
        System.out.print(s.next() + "\n" + s.next());
        s.close();
    }
}
