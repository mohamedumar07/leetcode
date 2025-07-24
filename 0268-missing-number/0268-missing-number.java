class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return ((n * (n - 1)) / 2) - sum;
    }
}