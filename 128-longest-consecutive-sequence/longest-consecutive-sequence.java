import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        int maxLength = 0;
        int currLen = 0;

        for(int num : nums){
            numSet.add(num);
        }

        for(int num : numSet){
            if(!numSet.contains(num - 1)){
                currLen = 1;
                while(numSet.contains(num + 1)){
                    currLen++;
                    num++;
                }
            }
            maxLength = Math.max(maxLength, currLen);
        }

        return maxLength;
    }
}