import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int solution[] = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            if(prefixSum.containsKey(result)){
                solution[0] = prefixSum.get(result);
                solution[1] = i; 
            }
            prefixSum.put(nums[i], i);
        }
        return solution;
    }
}