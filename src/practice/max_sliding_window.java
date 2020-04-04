package practice;

import java.util.Stack;

public class max_sliding_window {
	public void solve(int[] numbers, int windowSize) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> result = new Stack<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			s1.push(numbers[i]);
		}
		while (s1.size() >= 4) {
			int currentMax = 0;
			Stack<Integer> s2 = new Stack<Integer>();
			for (int i = 0; i < windowSize; i++) {
				int nextNumber = s1.pop();
				if (nextNumber > currentMax) currentMax = nextNumber;
				s2.push(nextNumber);
			}
			result.push(currentMax);
			for (int i = 0; i < windowSize - 1; i++) {
				s1.push(s2.pop());
			}
		}
		while (!result.isEmpty()) {
			System.out.print(result.pop() + " ");
		}
	}
	
	static public void main(String[] args) {
		int[] numbers = {2, 7, 3, 1, 5, 2, 6, 2};
		new max_sliding_window().solve(numbers, 4);
	}
}
