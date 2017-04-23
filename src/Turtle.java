import java.util.Scanner;

public class Turtle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
                B[i][0] = 0;
                B[0][j] = 0;
                B[i + 1][j + 1] = A[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i + 1][j + 1] = max(B[i][j + 1], B[i + 1][j]) + A[i][j];
            }
        }
        System.out.println(B[N][N]);
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
