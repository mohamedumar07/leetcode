class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        int prefixSum = 0;
        int rem = 0;
        int n = nums.length;
        hash.put(0, -1);
        for(int i = 0; i < n; i++){
            prefixSum = prefixSum + nums[i];
            rem = prefixSum % k;
            if(hash.containsKey(rem)){
                if(i - hash.get(rem) >= 2)
                    return true;
            }
            else
                hash.put(rem, i);
        }
        return false;
    }
}