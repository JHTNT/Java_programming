import java.util.Scanner;

public class Ch05_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        sc.close();

        switch (day) {
            case "1": case "2": case "3": case "4": case "5":
                System.out.print("day");
                break;
            case "6":
                System.out.print("night");
                break;
            case "7":
                System.out.print("rest");
                break;
            default:
                System.out.print("Input Error");
                break;
        }
    }
}
