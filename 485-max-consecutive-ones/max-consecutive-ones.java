class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;

        int counter = 0;
        for(int num : nums)
        {
            if(num == 1)
            {
                counter++;
            }else{
                maximum = Math.max(counter, maximum);
                counter = 0;
            }
            
        }
        return Math.max(counter, maximum);
    }
}