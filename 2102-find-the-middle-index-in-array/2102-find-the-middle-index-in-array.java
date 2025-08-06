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
        System.out.println(Arrays.toString(rightSum));
        for(int i = 1; i <= n; i++)
        {
            System.out.println(leftSum);
            if(leftSum == rightSum[i - 1]){
                return i - 1;
            }
            leftSum = leftSum + nums[i - 1];
        }
        return -1;
    }
}