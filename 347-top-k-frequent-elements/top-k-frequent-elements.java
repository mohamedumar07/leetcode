class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[k];
        List<Integer>[] bucket = new List[nums.length+1];
        int temp = 0;
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(Integer n: freq.keySet()){
            int key = freq.get(n);

            if(bucket[key] == null){
                bucket[key] = new ArrayList<>();
            }
            bucket[key].add(n);
        }

        for(int i = bucket.length - 1; i >= 0 && temp < k; i--){
            if(bucket[i] != null){
                for(int n: bucket[i]){
                    res[temp++] = n;

                    if(temp == k)
                        return res;
                }
            }
        }
        return null;
    }
}