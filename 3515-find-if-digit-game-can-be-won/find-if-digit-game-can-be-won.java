class Solution {
    public boolean canAliceWin(int[] nums) {
        int doubleSum = 0;
        int singleSum = 0;

        for(int num : nums){
            if(num < 10){
                singleSum += num;
            }else{
                doubleSum += num;
            }
        }

       return singleSum != doubleSum;
    }
}