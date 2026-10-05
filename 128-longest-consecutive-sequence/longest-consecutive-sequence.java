class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int temp = 0;
        int maxConsecutive = 0;
        for(int num: nums){
            set.add(num);
        }

        for(Integer n: set){
            if(!set.contains(n - 1)){
                temp = 1;
                while(set.contains(n + 1)){
                    temp++;
                    n++;
                }
                if(temp > maxConsecutive)
                    maxConsecutive = temp;
            }
        }
        return maxConsecutive;
    }
}