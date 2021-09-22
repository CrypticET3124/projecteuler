public class x10 {
    public static void main(String[] args) {
        int n = 0;

        boolean re = true;
        for (int x = 1; x < 2000000; x += 2) {
            inner: for (int z = 2; z <= x / 2; z++) {
                if (x % z == 0 && z != x) {
                    break inner;
                } else if (z == x) {
                    
                    System.out.println(x);
                }
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