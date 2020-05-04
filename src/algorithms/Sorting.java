package algorithms;

public class Sorting {
	
	/**
	 * Selection sort algorithm
	 * Runtime: O(n^2)
	 * Memory: O(1)
	 * 
	 * @param nums input array
	 */
	
	public static void selectionSort(int[] nums) {
		int point = 0;
		while (point < nums.length) {
			int minIndex = point;
			for (int i = point + 1; i < nums.length; i++) {
				if (nums[i] < nums[minIndex]) minIndex = i;
			}
			swap(nums, point, minIndex);
			point++;
		}
	}
	
	/**
	 * Merge sort algorithm
	 * Runtime: O(nlogn)
	 * Memory: O(n)
	 * 
	 * @param nums input array
	 */
	
	public static void mergeSort(int[] nums) {
		if (nums.length < 2) return;
		int mid = nums.length / 2;
		int[] A = new int[mid];
		int[] B = new int[nums.length - mid];
		for (int i = 0; i < mid; i++) {
			A[i] = nums[i];
		}
		for (int i = mid; i < nums.length; i++) {
			B[i - mid] = nums[i];
		}
		mergeSort(A);
		mergeSort(B);
		merge(nums, A, B);
	}
	
	/**
	 * Helper function to swap values inside array
	 * 
	 * @param nums input array
	 * @param i index of first element
	 * @param j index of second element
	 */
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	/**
	 * Helper function to merge 2 sorted arrays
	 * 
	 * @param nums input array
	 * @param A first sorted array
	 * @param B second sorted array
	 */
	
	public static void merge(int[] nums, int[] A, int[] B) {
		int point = 0;
		int i = 0;
		int j = 0;
		while (i < A.length && j < B.length) {
			int a = A[i];
			int b = B[j];
			if (a <= b) {
				nums[point++] = a;
				i++;
			}
			else {
				nums[point++] = b;
				j++;
			}
		}
		while (i < A.length) nums[point++] = A[i++];
		while (j < B.length) nums[point++] = B[j++];
	}
	
	public static void main(String args[]) {
		int[] input = {20,30,8,2,5};
		mergeSort(input);
		for (int i : input) {
			System.out.println(i);
		}
	}
}
