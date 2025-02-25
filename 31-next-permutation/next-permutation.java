class Solution {
    public void nextPermutation(int[] nums) {
        //we need to find a dip
            //[1, 2, 3] -> 2 is the dip
            //replace it with the next largest number which is 3.

            //[1, 2, 3, 5, 4] 3 is the dip
            //[1, 2, 4, 5, 3] -> after swap
            //reverse from dip + 1

        int dip = -1;
        int len = nums.length - 1;

        for(int i = len; i > 0; i--){
            if(nums[i - 1] < nums[i]){
                dip = i - 1;
                break;
           }
        }

        if(dip == -1){
            for(int i = 0; i <= len / 2; i++){
                int temp = nums[i];
                nums[i] = nums[len - i];
                nums[len - i] = temp;
            }
        }else{
            for(int i = len; i >= dip; i--){
                if(nums[i] > nums[dip]){
                    int temp = nums[i];
                    nums[i] = nums[dip];
                    nums[dip] = temp;
                    break;
                }
            }

            int pos = 0;

            for(int i = dip + 1; i <= (dip + len) / 2; i++){
                int temp = nums[i];
                nums[i] = nums[len - pos];
                nums[len - pos] = temp;
                pos++;
            }
        }
    }
}