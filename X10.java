public class X10 {
    public static void main(String[] args) {
        Long n = 2L;

        for (Long x = 3L; x < 2000000L; x += 2L) {
            inner: for (Long z = 2L; z <= x; z++) {
                if (z.equals(x)) {
                    n += x;
                    System.out.println(x);
                } else if (x % z == 0L) {
                    break inner;
                }
            }
        }
        System.out.print(n);
    }
}
/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 */