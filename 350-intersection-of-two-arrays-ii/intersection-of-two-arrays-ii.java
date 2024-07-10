import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int n: nums1){
            map1.put(n, map1.getOrDefault(n, 0)+1);
        }

        for(int n: nums2){
            if(map1.getOrDefault(n, 0) > 0){
                al.add(n);
                map1.put(n, map1.get(n) - 1);
            }
        }
        int arr[] = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}