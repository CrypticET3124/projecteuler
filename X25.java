import java.math.BigInteger;

public class X25 {
    public static void main(String[] args) {
        // biginteger array with 1,1,0
        BigInteger[] a = { BigInteger.valueOf(1), BigInteger.valueOf(1), BigInteger.valueOf(0) };
        // biginteger count
        BigInteger count = BigInteger.valueOf(2);

        // loop until a[2] has 1000 digits
        do {
            // a[2] = a[0] + a[1]
            a[2] = a[0].add(a[1]);
            // a[0] = a[1]
            a[0] = a[1];
            // a[1] = a[2]
            a[1] = a[2];
            // count++
            count = count.add(BigInteger.valueOf(1));
        } while (a[1].toString().length() < 1000);
        System.out.println(count);
    }
}
/*
 * The Fibonacci sequence is defined by the recurrence relation:
 * 
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1. Hence the first 12 terms will be:
 * 
 * F1 = 1
 * 
 * F2 = 1
 * 
 * F3 = 2
 * 
 * F4 = 3
 * 
 * F5 = 5
 * 
 * F6 = 8
 * 
 * F7 = 13
 * 
 * F8 = 21
 * 
 * F9 = 34
 * 
 * F10 = 55
 * 
 * F11 = 89
 * 
 * F12 = 144
 * 
 * The 12th term, F12, is the first term to contain three digits.
 * 
 * What is the index of the first term in the Fibonacci sequence to contain 1000
 * digits?
 */