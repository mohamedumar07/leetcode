class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0] ;//stores the maximum Sum
        int sum = 0 ;//stores the temp sum

        for(int num: nums){
            sum += num;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}