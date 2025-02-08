import java.lang.Math;
import java.util.HashMap;
class Solution {
    
    //*SOLUTION - 1

    // HashMap<Integer, Integer> map = new HashMap<>();
    public int majorityElement(int[] nums) {
    //     int threshold = (int)Math.ceil(nums.length/2);
    //     int majority = 0;
    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         if(map.containsKey(nums[i]))
    //         {
    //             map.put(nums[i], map.get(nums[i])+1);
    //         }
    //         else{
    //             map.put(nums[i], 1);
    //         }
    //     }
    //     for(int i : map.keySet())
    //     {
    //         if(map.get(i) > threshold)
    //         {
    //             majority = i;
    //             break;
    //         }
    //     }
    //     return majority;
    int candidate = nums[0];
    int vote = 1;

    for(int i = 1; i < nums.length; i++)
    {
        if(nums[i] == candidate){
            vote++;
        }else{
            vote--;
            if(vote < 0){
                candidate = nums[i];
                vote = 1;
            }
        }
    }

    return candidate;

    // //SOLUTION - 2
    // int count = 0;
    // int element = 0;
    // for(int num : nums)
    // {
    //     if(count == 0)
    //     {
    //         element = num;
    //         count = 1;
    //     }
    //     else if(element == num)
    //     {
    //         count++;
    //     }
    //     else{
    //         count--;
    //     }
    // }
    // return element;
    }
}