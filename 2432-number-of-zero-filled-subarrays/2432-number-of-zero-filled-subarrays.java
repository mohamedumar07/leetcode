class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalZero = 0;
        int consZero = 0;

        for(int num: nums){
            if(num == 0){
                consZero++;
                totalZero += consZero;
            }else{
                consZero = 0;
            }
        }
        return totalZero;
    }
}