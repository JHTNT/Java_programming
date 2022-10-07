import java.util.Scanner;

public class Ch05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.nextLine();

        for (int i = 0; i < x.length(); i++) {
            switch (x.charAt(i)) {
                case ' ':
                    System.out.print(" ");
                    break;
                case 'a':
                    System.out.print("A");
                    break;
                case 'b':
                    System.out.print("B");
                    break;
                case 'c':
                    System.out.print("C");
                    break;
                case 'd':
                    System.out.print("D");
                    break;
                case 'e':
                    System.out.print("E");
                    break;
                default:
                    System.out.print("Z");
            }
        }
        sc.close();
    }
}
