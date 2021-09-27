public class X21 {
    public static int div(int n) {
        int c = 0;
        for (int x = 1; x <= (n / 2); x++) {
            if (n % x == 0) {
                c += x;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int c = 0;
        int lim = 10000;

        for (int x = 1; x <= lim; x++) {
            int a = div(x);

            if (x < a && a < lim) {
                int b = div(a);

                if (b == x) {
                    c += a + b;
                }
            }
        }
        System.out.println(c);
    }
}
/*
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 */