import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int res = 0;
        for(Integer n : nums){
            if(numsMap.containsKey(n)){
                res = n;
                break;
            }
            else
                numsMap.put(n, 1);
        }
        return res;
    }
}