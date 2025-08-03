class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sumLeft[] = new int[n];
        int sumRight[] = new int[n];
        sumLeft[0] = 0;
        sumRight[n - 1] =0;

        for(int i = 1; i < n; i++){
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }

        for(int j = 0; j < n; j++){
            if(sumRight[j] == sumLeft[j]){
                return j;
            }
        }

        return -1;
    }
}