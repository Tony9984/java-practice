package challenges;

import java.util.HashMap;

public class TruckPackage {
    public static int[] findSolution(int[] nums, int target) {
    	int[] res = new int[2];
    	int realTarget = target - 30;
    	int max = 0;
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (map.containsKey(realTarget - nums[i])) {
    			int newMax = Math.max(nums[i], realTarget - nums[i]);
    			if (newMax > max) {
        			res[0] = i;
        			res[1] = map.get(realTarget - nums[i]);
    			}
    			max = newMax;
    		}
    		map.put(nums[i], i);
    	}
    	return res;
    }
    
    public static void main(String args[]) {
    	int[] input = {20, 50, 40, 25, 30, 10};
    	int[] solution = new int[2];
    	solution = findSolution(input, 90);
    	System.out.println(solution[0]);
    	System.out.println(solution[1]);
    }
}
