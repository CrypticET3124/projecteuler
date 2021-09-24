import java.math.BigInteger;

public class x20 {
    public static void main(String[] args) {
        BigInteger c = BigInteger.valueOf(1);

        for (int x = 100; x > 0; x--) {
            c = c.multiply(BigInteger.valueOf(x));
        }
        String n = c.toString();
        Long nl = Long.valueOf(n.length());
        System.out.println(n);

        Long nn = 0L;

        for (Long x = 0L; x < nl; x++) {
            nn += Character.getNumericValue(n.charAt(0));
            n = n.substring(1);
        }
        System.out.println(nn);
    }
}
/*
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * 
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the
 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 */