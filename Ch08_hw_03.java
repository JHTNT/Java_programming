import java.util.Scanner;

public class Ch08_hw_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        char col;
        Boolean seat[][] = new Boolean[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                seat[i][j] = false;
            }
        }
        while (sc.hasNext()) {
            String s = sc.next().toUpperCase();
            row = s.charAt(0) - '0';
            col = s.charAt(1);
            if (row < 1 || row > 7 || !(col == 'A' || col == 'B' || col == 'C' || col == 'D')) {
                System.out.print("ERROR");
                return;
            }
            seat[row - 1][col - 'A'] = true;
        }
        sc.close();

        for (int i = 0; i < 7; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < 4; j++) {
                if (seat[i][j] == true) {
                    System.out.print(" X");
                } else {
                    System.out.print(" " + (char) ('A' + j));
                }
            }
            if (i != 6) System.out.println();
        }
    }
}
