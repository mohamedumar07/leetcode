class Solution {
    public int removeDuplicates(int[] nums) {
        int movePtr = 1;
        int curr = nums[0];
        for(int idx = 1; idx < nums.length; idx++){
            if(nums[idx] != curr){
                nums[movePtr++] = nums[idx];
                curr = nums[idx]; 
            }
        }
        return movePtr;
    }
}