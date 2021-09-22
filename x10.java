public class x10 {
    public static void main(String[] args) {
        Long n = 0L;

        for (Long x = 1L; x < 2000000; x += 2) {
            inner: for (Long z = 1L; z <= x; z++) {
                if (z.equals(x)) {
                    n += x;
                    System.out.println(x);
                } else if (x % z == 0) {
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