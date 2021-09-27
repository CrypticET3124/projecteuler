public class X7 {
    public static void main(String[] args) {
        int p = 1;
        int n = 0;

        boolean re = true;
        for (int x = 3; re; x += 2) {
            inner: for (int z = 2; z <= x; z++) {
                if (z == x) {
                    p++;
                    System.out.println(p);
                } else if (x % z == 0) {
                    break inner;
                }
            }
            if (p == 10001) {
                n = x;
                re = false;
            }
        }
        System.out.print(n);
    }
}
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */ 