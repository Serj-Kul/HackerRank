import java.math.BigInteger;
import java.util.Scanner;
 
class Candies {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = scanner.nextBigInteger(); // кол-во конфет
        BigInteger M = scanner.nextBigInteger(); // за один присест
        int res = N.compareTo(M);
        if (res < 0) {
            System.out.println(factorial(N));
        } else {
            System.out.println(factorial(N).divide(factorial(N.subtract(M))));
        }
    }
 
    private static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
 
        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }
}
