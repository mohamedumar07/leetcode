class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int len = points.length;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((left, right) -> {
                return right[0] * right[0] + right[1] * right[1] - left[0] * left[0] - left[1] * left[1];
        }
        );

        for(int x = 0; x < len; x++){
            maxHeap.offer(points[x]);
            if(maxHeap.size() > k)
                maxHeap.poll();
        }

        int temp = 0;
        int res[][] = new int[k][2];
        while(!maxHeap.isEmpty()){
            int curr[] = maxHeap.poll();
            res[temp][0] = curr[0];
            res[temp][1] = curr[1];
            temp++;
        }

        return res;
    }
}