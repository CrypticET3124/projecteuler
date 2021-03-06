public class X14 {
    public static void main(String[] args) {
        Long maxc = 0L;
        Long maxn = 0L;

        for (Long x = 1L; x < 1000000L; x++) {
            Long n = x;
            Long nn = x;
            Long c = 0L;

            while (n != 1) {
                if (n % 2L == 0L) {
                    n /= 2L;
                    c++;
                } else {
                    n = n * 3L + 1L;
                    c++;
                }
            }
            if (c > maxc) {
                maxc = c;
                maxn = nn;
            }
        }
        System.out.print("max:" + maxn);
    }
}
/*
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 It can be seen that this sequence
 * (starting at 13 and finishing at 1) contains 10 terms. Although it has not
 * been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */