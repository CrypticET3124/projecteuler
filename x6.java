public class X6 {
    public static void main(String[] args) {
        long s = 0;
        long sq = 0;

        for (long x = 1; x < 101; x++) {
            s += Math.pow(x, 2);
        }
        for (long x = 1; x < 101; x++) {
            sq += x;
        }
        sq = sq * sq;
        System.out.print(sq - s);
    }
}
/*
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is
 * 
 * 3025 - 385 = 2640
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 */