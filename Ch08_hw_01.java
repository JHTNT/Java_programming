import java.util.Scanner;

public class Ch08_hw_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int score[] = new int[n];
        int min;

        score[0] = sc.nextInt( );
        min = score[0];
        for (int i = 1; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < min)
                 min = score[i];
        }
        sc.close();

        System.out.println(min);
        for (int i : score) {
            System.out.println(i - min);
        }
    }
}
