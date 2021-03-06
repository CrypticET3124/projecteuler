import java.math.BigInteger;

public class X16 {
	public static void main(String[] args) {
		Long e = 1000L;
		BigInteger r = BigInteger.valueOf(1);

		while (e > 0L) {
			r = r.multiply(BigInteger.valueOf(2));
			e--;
			System.out.println(e);
		}
		String n = r.toString();
		Long nl = Long.valueOf(n.length());
		System.out.println(n);

		Long c = 0L;

		for (Long x = 0L; x < nl; x++) {
			c += Character.getNumericValue(n.charAt(0));
			n = n.substring(1);
		}
		System.out.println(c);
	}
}
/*
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 */