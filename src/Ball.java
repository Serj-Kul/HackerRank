import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // число ступенек

        long[] jump = new long[N + 1];
        jump[0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = max(0, i - 3); j < i; j++){
                jump[i] += jump[j];
            }
        }
        System.out.println(jump[N]);
    }
    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}