class Solution {
    public void moveZeroes(int[] nums) {
        // int ptr1 = 0;
        // int temp;
        // for(int ptr2 = 0; ptr2 < nums.length; ptr2++){
        //     if(nums[ptr2] !=0 ){
        //         temp = nums[ptr1];
        //         nums[ptr1] = nums[ptr2];
        //         nums[ptr2] = temp;
        //         ptr1++;
        //     }
        // }
        int len = nums.length;
        int ptr1 = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                nums[ptr1++] = nums[i]; 
            }
        }
        for(; ptr1 < len;){
            nums[ptr1++] = 0;
        }
    }
}