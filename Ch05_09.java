public class Ch05_09 {
    public static void main(String[] args) {
        // TOO + TOO + TOO + TOO = GOOD
        // TOO * 4 = GOOD, GOOD % 2 = 0
        int t, o, g, d;
        loop:
        for (t = 0; t < 10; t++) {
            for (o = 0; o < 10; o++) {
                for (g = 0; g < 4; g++) {
                    for (d = 0; d < 10; d += 2) {
                        if (((t * 100 + o * 11) * 4 == (g * 1000 + o * 110 + d)) &&
                              !(t == o || t == g || t == d || o == g || o == d || g == d)) {
                            System.out.printf("T = %d O = %d G = %d D = %d", t, o, g, d);
                            break loop;
                        }
                    }
                }
            }
        }
    }
}
