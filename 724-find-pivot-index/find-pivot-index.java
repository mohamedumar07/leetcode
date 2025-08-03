class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sumRight[] = new int[n];
        sumRight[n - 1] =0;

        for(int i = n - 2; i >= 0; i--){
            //in order to return left most index
            //we are summing the right
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }

        int leftSum = 0;
        for(int i = 0; i < n; i++){
            if(sumRight[i] == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}