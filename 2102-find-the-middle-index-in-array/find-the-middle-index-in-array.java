class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] rightSum = new int[n];
        int leftSum = 0;
        rightSum[n - 1] = 0;
        for(int j = n - 2; j >= 0; j--)
        {
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }
        for(int i = 0; i < n; i++)
        {
            if(leftSum == rightSum[i]){
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}