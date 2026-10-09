import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        
        //1) Create the frequency mapper for each words
        for(String str: words){
            freq.put(str, freq.getOrDefault(str, 0) + 1);
        }

        //2)we put it in a min heap;
        //we have added a comparator
        //if both has same frequency, we sort them by lexi
        PriorityQueue<AbstractMap.SimpleEntry<Integer, String>> minHeap = new PriorityQueue<>((a, b) -> {
        if (!a.getKey().equals(b.getKey()))
            return Integer.compare(a.getKey(), b.getKey());

        return b.getValue().compareTo(a.getValue());
    });

        //3) Iterate through the mapper and push them
        //into the queue
        for(String str: freq.keySet()){
            int key = freq.get(str);
            minHeap.offer(new AbstractMap.SimpleEntry<Integer,String>(key, str));

            if(minHeap.size() > k)
                minHeap.poll();
        }

        //4) Storing the k elements in the result;
        List<String> res = new ArrayList<>();
        int temp = 0;
        while(temp < k){
            res.add(temp++, minHeap.poll().getValue());
        }

        Collections.reverse(res);
        return res;
    }
}