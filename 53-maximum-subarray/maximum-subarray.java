class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length - 1;
        for(int i = 0; i <= n; i++)
        {
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}