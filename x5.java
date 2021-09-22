public class x5 {
    public static void main(String[] args) {
        int n = 0;
        boolean re = true;
        for (int x = 21; re; x++) {
            inner: for (int z = 6; z < 21; z++) {
                if (x % z != 0) {
                    break inner;
                } else if (z == 20) {
                    n = x;
                    re = false;
                }
            }
        }
        System.out.print(n);
    }
}
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 */