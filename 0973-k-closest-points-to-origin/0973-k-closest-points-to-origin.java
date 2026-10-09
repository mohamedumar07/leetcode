import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int len = points.length;
        PriorityQueue<AbstractMap.SimpleEntry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> {
            double aDistance = Math.sqrt(Math.pow(a.getKey(), 2) + Math.pow(a.getValue(), 2));
            double bDistance = Math.sqrt(Math.pow(b.getKey(), 2) + Math.pow(b.getValue(), 2));
            return Double.compare(bDistance, aDistance);
        });

        for(int x = 0; x < len; x++){
            maxHeap.offer(new AbstractMap.SimpleEntry<>(points[x][0], points[x][1]));

            if(maxHeap.size() > k)
                maxHeap.poll();
        }

        int temp = 0;
        int res[][] = new int[k][2];
        while(!maxHeap.isEmpty()){
            AbstractMap.SimpleEntry<Integer, Integer> curr = maxHeap.poll();
            res[temp][0] = curr.getKey();
            res[temp][1] = curr.getValue();
            temp++;
        }

        return res;
    }
}