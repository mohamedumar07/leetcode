class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int num: nums){
            if(num == 1){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if(count > maxCount){
            maxCount = count;
        }
        return maxCount;
    }
}