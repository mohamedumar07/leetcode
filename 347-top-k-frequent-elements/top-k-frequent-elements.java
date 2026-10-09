class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[k];
        int temp = 0;
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        LinkedHashMap<Integer, Integer> sortedandOrdered = freq.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(
            Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)
        );

        for(Map.Entry<Integer, Integer> n: sortedandOrdered.entrySet()){
            if(temp == k)
                break;
            res[temp++] = n.getKey();
        }
        return res;
    }
}