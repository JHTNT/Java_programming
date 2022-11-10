import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ch08_hw_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> nums = new TreeMap<>(Collections.reverseOrder());
        while (sc.hasNextInt()) {
            nums.merge(sc.nextInt(), 1, Integer::sum);
            // another approach:
            // nums.merge(sc.nextInt(), 1, (a, b) -> a + b);
        }
        sc.close();

        Boolean first = false;
        for (Map.Entry<Integer, Integer> i : nums.entrySet()) {
            if (first) {
                System.out.println();
            } else {
                first = true;
            }
            System.out.print(i.getKey() + " " + i.getValue());
        }
    }
}
