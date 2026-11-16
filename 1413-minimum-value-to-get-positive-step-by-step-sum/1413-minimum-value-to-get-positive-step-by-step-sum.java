class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int i;
        for(i = 1; i <= 10000; i++){
            prefixSum = i;
            for(int num: nums){
                prefixSum += num;
                if(prefixSum <= 0)
                    break;
            }
            if(prefixSum > 0)
                return i;
        }
        return i;
    }
}