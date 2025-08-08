import java.util.*;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> prefix = new HashSet<>();
        Set<Integer> suffix = new HashSet<>();
        int n = nums.length;
        int res[] = new int[n];
        int pre[] = new int[n];

        for(int j = 0; j < n; j++){
            prefix.add(nums[j]);
            pre[j] = prefix.size();
        }

        for(int i = n - 1; i >= 0; i--){
            res[i] = pre[i] - suffix.size();
            suffix.add(nums[i]);
        }
        return res;
    }
}