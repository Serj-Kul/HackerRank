import java.math.BigInteger;
import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        BigInteger[] steps = new BigInteger[N + 1];

        if (N == 0) {
            System.out.println(1);
        } else if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(2);
        } else if (N >= 3) {
            steps[0] = BigInteger.valueOf(1);
            steps[1] = BigInteger.valueOf(2);
            steps[2] = BigInteger.valueOf(4);
            int i = 3;
            while (i < N) {
                steps[i] = steps[i - 3].add((steps[i - 2].add(steps[i - 1])));
                i++;
            }
            System.out.println(steps[i - 1]);
        }
    }
}
