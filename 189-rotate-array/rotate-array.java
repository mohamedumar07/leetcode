class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if(k > len){
            return;
        }
        int temp[] = new int[k];

        for(int i = len - k; i < len; i++){
            temp[i - len + k] = nums[i];
        }

        for(int j = len - k - 1; j >= 0 ; j--){
            nums[j + k] = nums[j];
        }

        for(int l = 0; l < k; l++){
            nums[l] = temp[l];
        }
    }
}