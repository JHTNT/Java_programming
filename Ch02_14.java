import java.util.Scanner;

public class Ch02_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.close();

        int day = (int) (n / 86400000);
        n %= 86400000;
        int hr = (int) (n / 3600000);
        n %= 3600000;
        int min = (int) (n / 60000);
        n %= 60000;
        int sec = (int) (n / 1000);
        System.out.print(day + " " + hr + " " + min + " " + sec);
    }
}
