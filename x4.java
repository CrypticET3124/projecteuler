public class x4 {
	public static void main(String[] args) {
		int max = 0;

		for (int x = 1; x < 1000; x++) {
			for (int z = 1; z < 1000; z++) {
				int n = x * z;
				int b = 0;
				int temp = n;

				while (n > 0) {
					int r = n % 10;
					b = (b * 10) + r;
					n = n / 10;
				}
				if (temp == b && temp > max) {
					max = b;
				}
			}
		}
		System.out.print(max);
	}
}
/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */