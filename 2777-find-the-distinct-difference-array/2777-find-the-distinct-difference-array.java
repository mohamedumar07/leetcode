import java.util.*;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> prefix = new HashSet<>();
        Set<Integer> suffix = new HashSet<>();
        int n = nums.length;
        int res[] = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                prefix.add(nums[j]);
            }
            for(int k = i + 1; k < n; k++){
                suffix.add(nums[k]);
            }
            res[i] = prefix.size() - suffix.size();
            prefix.clear();
            suffix.clear();
        }
        return res;
    }
}