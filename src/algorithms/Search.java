package algorithms;

public class Search {
	
	/**
	 * Iterative implementation of binary search
	 * Memory: O(1)
	 * Runtime: O(logn)
	 * 
	 * @param nums input array
	 * @param k key to be searched
	 * @return index of key, -1 if not found
	 */
	
	public static int binarySearchIterative(int[] nums, int k) {
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			
			int mid = (low + high) / 2;
			
			if (nums[mid] == k) return mid;
			else if (nums[mid] < k) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	/**
	 * Recursive implementation of binary search
	 * Memory: O(logn)
	 * Runtime: O(logn)
	 * 
	 * @param nums input array
	 * @param k key to be searched
	 * @param low lower search bound
	 * @param high upper search bound
	 * @return index of key, -1 if not found
	 */
	
	public static int binarySearchRecursive(int[] nums, int k, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == k) return mid;
			else if (nums[mid] < k) return binarySearchRecursive(nums, k, mid + 1, high);
			else return binarySearchRecursive(nums, k, low, mid - 1);
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int[] test = {1,2,5,10,12,14};
		System.out.println(binarySearchIterative(test, 3));
		System.out.println(binarySearchRecursive(test, 3, 0, test.length - 1));
	}
}
