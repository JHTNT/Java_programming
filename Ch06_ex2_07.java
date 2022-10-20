import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch06_ex2_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String last, first, middle;
        StringTokenizer st = new StringTokenizer(sc.nextLine(), ", ");
        sc.close();

        last = st.nextToken();
        first = st.nextToken();
        middle = st.nextToken();

        System.out.print("Hello ");
        if (!first.equalsIgnoreCase("None")) System.out.print(first + " ");
        if (!middle.equalsIgnoreCase("None")) System.out.print(middle + " ");
        if (!last.equalsIgnoreCase("None")) System.out.print(last);
    }
}
