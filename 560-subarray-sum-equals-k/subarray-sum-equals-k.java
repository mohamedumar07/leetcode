import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();

        int prefixSum = 0;

        prefixSumFreq.put(prefixSum, 1);
        int count = 0;

        for(int num: nums)
        {
            prefixSum += num;

            if(prefixSumFreq.containsKey(prefixSum - k)){
                count += prefixSumFreq.get(prefixSum - k);
            }

            if(prefixSumFreq.containsKey(prefixSum)){
                prefixSumFreq.put(prefixSum, prefixSumFreq.get(prefixSum) + 1);
            }else{
                prefixSumFreq.put(prefixSum, 1);
            }
        }

        return count;
    }
}