class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int left = 0;
        int right = len - 1;
        int idx = right;
        //int count = 0;
        int temp1;
        int temp2;

        while(left <= right){
            temp1 = nums[left]; //16
            temp2 = nums[right]; //9
            if(temp1 > temp2){
                ans[idx--] = temp1;
                left++;
            }else{
                ans[idx--] = temp2; //100
                right--;
            }
        }
        return ans;
    }
}