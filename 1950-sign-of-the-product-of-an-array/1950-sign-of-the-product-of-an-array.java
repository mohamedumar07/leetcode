class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int num : nums){
           if(num < 0)
                num = -1;
            else if(num > 0)
                num = 1;
            prod *= num;
        }

        if(prod > 0){
            return 1;
        }else if(prod < 0){
            return -1;
        }else{
            return 0;
        }
    }
}