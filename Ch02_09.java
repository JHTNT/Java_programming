import java.util.Scanner;

public class Ch02_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("#.*#");
        System.out.print(sc.next() + sc.next());
        sc.close();
    }
}
