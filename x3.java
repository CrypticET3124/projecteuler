public class X3 {
	public static void main(String[] args) {
		long n = 600851475143L;

		if (n % 2 == 0) {
			n /= 2;
		}
		for (long x = 3; x <= Math.sqrt(n); x += 2) {
			if (n % x == 0) {
				n /= x;
			}
		}
		System.out.println(n);
	}
}
/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */ 