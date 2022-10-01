import java.util.Scanner;

public class Ch03_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        s = s.replace("I", "i").replace("hate", "Love").replaceAll("(?i)java", "JAVA").replace(" ", "");
        System.out.print("***" + s + "***");
    }
}
