package challenges;

import java.util.*;

public class CountSheep {
	public static void main(String[] args) {
		System.out.println(countSheep(0));
	}

	public static String countSheep(int input) {
		Set<Integer> numbers = new HashSet<Integer>();
		Set<Integer> digits = new HashSet<Integer>();
		int size = 0;
		int current = input;
		while (numbers.add(current)) {
			System.out.println(current);
			int copy = current;
			while (copy > 0) {
				if (digits.add(copy % 10))
					size++;
				copy /= 10;
			}
			if (size == 10)
				return "" + current;
			current += input;
		}
		return "INSOMNIA";
	}
}
