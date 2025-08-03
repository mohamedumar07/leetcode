import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        freq.put(0, 1); //handles the first instance of K.

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            if(freq.containsKey(prefixSum - k)){
                count += freq.get(prefixSum - k);
            }

            if(freq.containsKey(prefixSum)){
                freq.put(prefixSum, freq.get(prefixSum) + 1);
            }else{
                freq.put(prefixSum, 1);
            }
        }
        return count;
    }
}