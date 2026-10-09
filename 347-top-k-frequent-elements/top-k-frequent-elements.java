class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[k];
        int temp = 0;
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
                if(a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            }
        );

        for(Integer map: freq.keySet()){
            minHeap.offer(new int[]{freq.get(map), map});
            if(minHeap.size() > k)
                minHeap.poll();
        }

        while(temp < k){
            res[temp++] = minHeap.poll()[1];
        }

        return res;
    }
}