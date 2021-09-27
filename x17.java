public class X17 {
	public static void main(String[] args) {
		Long c = 0L;
		System.out.println("started");

		for (int x = 1; x <= 1000; x++) {
			String n = "";
			boolean teen = false;

			if (x == 1000) {
				n += "onethousand";
			} else if (x % 1000 >= 900) {
				n += "ninehundred";
			} else if (x % 1000 >= 800) {
				n += "eighthundred";
			} else if (x % 1000 >= 700) {
				n += "sevenhundred";
			} else if (x % 1000 >= 600) {
				n += "sixhundred";
			} else if (x % 1000 >= 500) {
				n += "fivehundred";
			} else if (x % 1000 >= 400) {
				n += "fourhundred";
			} else if (x % 1000 >= 300) {
				n += "threehundred";
			} else if (x % 1000 >= 200) {
				n += "twohundred";
			} else if (x % 1000 >= 100) {
				n += "onehundred";
			}
			if (x % 1000 >= 100 && x % 100 > 0) {
				n += "and";
			}
			if (x % 100 >= 90) {
				n += "ninety";
			} else if (x % 100 >= 80) {
				n += "eighty";
			} else if (x % 100 >= 70) {
				n += "seventy";
			} else if (x % 100 >= 60) {
				n += "sixty";
			} else if (x % 100 >= 50) {
				n += "fifty";
			} else if (x % 100 >= 40) {
				n += "forty";
			} else if (x % 100 >= 30) {
				n += "thrity";
			} else if (x % 100 >= 20) {
				n += "twenty";
			} else if (x % 100 == 19) {
				n += "nineteen";
				teen = true;
			} else if (x % 100 == 18) {
				n += "eighteen";
				teen = true;
			} else if (x % 100 == 17) {
				n += "seventeen";
				teen = true;
			} else if (x % 100 == 16) {
				n += "sixteen";
				teen = true;
			} else if (x % 100 == 15) {
				n += "fifteen";
				teen = true;
			} else if (x % 100 == 14) {
				n += "fourteen";
				teen = true;
			} else if (x % 100 == 13) {
				n += "thirteen";
				teen = true;
			} else if (x % 100 == 12) {
				n += "twelve";
				teen = true;
			} else if (x % 100 == 11) {
				n += "eleven";
				teen = true;
			} else if (x % 100 == 10) {
				n += "ten";
				teen = true;
			}
			if (teen == false) {
				if (x % 10 == 9) {
					n += "nine";
				} else if (x % 10 == 8) {
					n += "eight";
				} else if (x % 10 == 7) {
					n += "seven";
				} else if (x % 10 == 6) {
					n += "six";
				} else if (x % 10 == 5) {
					n += "five";
				} else if (x % 10 == 4) {
					n += "four";
				} else if (x % 10 == 3) {
					n += "three";
				} else if (x % 10 == 2) {
					n += "two";
				} else if (x % 10 == 1) {
					n += "one";
				}
			}

			c += Long.valueOf(n.length());
			System.out.println(x + "|" + n + "|" + n.length() + "|" + c);
		}
		System.out.println(c);
	}
}
/*
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 */