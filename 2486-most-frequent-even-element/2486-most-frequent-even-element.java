class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreqEle = -1;
        int max = 0;
        int temp = 0;
        for(int num: nums){
            if(num % 2  == 0){
                temp = freq.getOrDefault(num, 0) + 1;
                if(temp > max){
                    maxFreqEle = num;
                    max = temp;
                }else if(temp == max){
                    if(maxFreqEle > num){
                        maxFreqEle = num;
                    }
                }
                freq.put(num, temp);
            }
        }

        return maxFreqEle;
       
    }
}