class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftSum = 0;
        int rightSum = 0;
        for(int num: nums){
            leftSum += num;
        }
        for(int i = 0; i < n; i++){
            leftSum = leftSum - nums[i];
            result[i] = Math.abs((leftSum - rightSum));
            rightSum += nums[i];
        }

        return result;
    }
}