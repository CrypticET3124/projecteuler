public class x9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        outer: for (a = 1; a<= 998; a++) {
            for (b = 1; b <= 998; b++) {
                for (c = 1; c <= 998; c++) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000) {
                        break outer;
                    }
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.print(a * b * c);
    }
}
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^22.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 */