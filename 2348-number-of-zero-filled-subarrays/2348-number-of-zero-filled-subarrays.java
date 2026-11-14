class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = 0;
        long count = 0;

        for(int num: nums){
            if(num == 0){
                n++;
                count += n;
            }else{
                n = 0;
            }
        }

        return count;
    }
}