import java.util.Scanner;

public class Ch05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeW = sc.nextInt(), sizeH = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt(), count = 0;
        sc.close();

        loop:
        for (int i = 0; i < sizeW; i++){
            for (int j = 0; j < sizeH; j++){
                count++;
                if (i == x && j == y) break loop;
            }
        }
        System.out.print(count);
    }
}
