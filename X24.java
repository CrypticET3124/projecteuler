import java.util.ArrayList;

public class X24 {
    public static int[] factoradic(int n) {
        n--;
        ArrayList<Integer> f = new ArrayList<>();
        int i = 1;
        while (n != 0) {
            f.add(n % i);
            n = n / i;
            i++;
        }
        // reverse arraylist and convert to array
        int[] result = new int[f.size()];
        for (int j = 0; j < f.size(); j++) {
            result[j] = f.get(f.size() - j - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        // ArrayList nums with 0 to 9
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }

        int[] f = factoradic(1000000);

        // for i in f get nums[i] and add to string s then remove nums at index i
        String s = "";
        for (int i = 0; i < f.length; i++) {
            s += nums.get(f[i]);
            nums.remove(f[i]);
        }
        System.out.println(s);
    }
}
/*
 * A permutation is an ordered arrangement of objects. For example, 3124 is one
 * possible permutation of the digits 1, 2, 3 and 4. If all of the permutations
 * are listed numerically or alphabetically, we call it lexicographic order. The
 * lexicographic permutations of 0, 1 and 2 are:
 * 
 * 012 021 102 120 201 210
 * 
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4,
 * 5, 6, 7, 8 and 9?
 */