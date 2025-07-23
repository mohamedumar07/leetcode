class Solution {
    public int removeDuplicates(int[] nums) {
        int movePtr = 1;
        for(int idx = 1; idx < nums.length; idx++){
            if(nums[idx] != nums[idx - 1]){
                nums[movePtr++] = nums[idx];
            }
        }
        return movePtr;
    }
}