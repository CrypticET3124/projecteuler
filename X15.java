import java.math.BigInteger;

public class X15 {
	// factorial function
	public static BigInteger bigFactorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (long i = 2L; i <= n; i++)
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
	public static void main(String[] args) {
		/*
		 * N-choose-k combinatorics: (n! / (k! * (n-k)!)
		 * 
		 * n is the total number of moves
		 * 
		 * k is the number of down and right moves required each direction
		 */
		long k = 20L;
		long n = k * 2L;

		BigInteger total = (bigFactorial(n).divide(bigFactorial(k).multiply(bigFactorial(n - k))));

		System.out.println(total);
	}
}
/*
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 */