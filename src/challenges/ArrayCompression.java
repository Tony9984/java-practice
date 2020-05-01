package challenges;

public class ArrayCompression {
	public static void main(String[] args) {
		int[] input = {1,1,1,5,3,3,9,3,3,3,3,3};
		compressArray(input);
	}
	
	public static void compressArray(int[] input) {
		int[] result = new int[input.length];
		int pointer = 0;
		int count = 0;
		for (int i = 0; i < input.length - 1; i++) {
			count++;
			if (input[i] != input[i + 1]) {
				result[pointer++] = input[i];
				result[pointer++] = count;
				count = 0;
			}
		}
		if (input[input.length - 1] != input[input.length - 2]) {
			result[pointer++] = input[input.length - 1];
			result[pointer] = 1;
		} else {
			result[pointer++] = input[input.length - 1];
			result[pointer] = count + 1;
		}
	}
}
