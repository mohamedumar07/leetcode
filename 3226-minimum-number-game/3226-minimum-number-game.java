class Solution {
    public int[] numberGame(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len];
        int count = 0;

        while(count < len){
            int min1 = 101;
            int min2 = 101;
            int idx = -1;
            int idx2 = -1;
            for(int i = 0; i < len; i++){
                if(nums[i] == -1){
                    continue;
                }
            if(nums[i] < min1){
                min2 = min1;
                min1 = nums[i];
                idx2 = idx;
                idx = i;
            }else if(nums[i] < min2 && nums[i] >= min1){
                min2 = nums[i];
                idx2 = i;
                }
            }
            System.out.println(idx);
            System.out.println(idx2);
            nums[idx] = -1;
            nums[idx2] = -1; 
            arr[count++] = min2;
            arr[count++] = min1;
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(nums));
            System.out.println(count);
            
        }
        return arr;
    }
}