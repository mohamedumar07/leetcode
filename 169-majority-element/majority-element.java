import java.lang.Math;
import java.util.HashMap;
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int majorityElement(int[] nums) {
        int threshold = (int)Math.ceil(nums.length/2);
        int majority = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(int i : map.keySet())
        {
            if(map.get(i) > threshold)
            {
                majority = i;
                break;
            }
        }
        return majority;
    }
}