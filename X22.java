import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class X22 {
	// function wordValue that takes in a lowercase string and returns the sum of
	// the value of each letter in the string
	public static int wordValue(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - 'a' + 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("X22names.txt")).useDelimiter(",")) {
			while (scanner.hasNext()) {
				names.add(scanner.next().replace("\"", "").toLowerCase());
			}
			Collections.sort(names);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// run wordValue on each name in the list and multiply the result by the index
		// of the name in the list
		// add each of these values together
		int total = 0;
		for (int i = 0; i < names.size(); i++) {
			total += wordValue(names.get(i)) * (i + 1);
		}
		System.out.println(total);
	}
}
/*
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 */
