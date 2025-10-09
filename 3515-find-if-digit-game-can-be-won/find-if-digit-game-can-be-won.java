class Solution {
    public boolean canAliceWin(int[] nums) {
        int doubleSum = 0;
        int singleSum = 0;

        for(int num : nums){
            if((num / 10) == 0){
                singleSum += num;
            }else{
                doubleSum += num;
            }
        }

        if(Math.abs(singleSum - doubleSum) > 0){
            return true;
        }else{
            return false;
        }
    }
}