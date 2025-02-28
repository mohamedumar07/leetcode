class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int times = nums.length / 3;

        for(int num: nums){
            int tempfreq = freq.getOrDefault(num, 0) + 1;
            
            if(tempfreq == (times + 1)){
                ans.add(num);
            }
            freq.put(num, tempfreq);
        }

        return ans;
    }
}