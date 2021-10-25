import java.util.ArrayList;

public class X26 {
    // method recurringLength takes in a double and returns the length of the longest recurring sequence of digits
    public static Double recurringLength(Double n) {
        // 
    }

    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>();
        // for i 1 to 999, add 1/i to nums
        for (int i = 2; i <= 999; i++) {
            nums.add(1.0 / i);
        }
        // for i in nums run recurring on i, if the result is greater than max, set max to result
        Double max = 0.0;
        for (Double i : nums) {
            Double result = recurringLength(i);
            if (result > max) {
                max = result;
            }
        }
        System.out.println(max);
    }
}
/*
 * A unit fraction contains 1 in the numerator. The decimal representation of
 * the unit fractions with denominators 2 to 10 are given:
 * 
 * 1/2 = 0.5
 * 
 * 1/3 = 0.(3)
 * 
 * 1/4 = 0.25
 * 
 * 1/5 = 0.2
 * 
 * 1/6 = 0.1(6)
 * 
 * 1/7 = 0.(142857)
 * 
 * 1/8 = 0.125
 * 
 * 1/9 = 0.(1)
 * 
 * 1/10 = 0.1
 * 
 * Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be
 * seen that 1/7 has a 6-digit recurring cycle.
 * 
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle
 * in its decimal fraction part.
 */