class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        // (n * (n + 1)) / 2) to find the sum of first n numbers.
        return ((n * (n + 1)) / 2) - sum;
    }
}