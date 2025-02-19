class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;

        int ans[] = new int[nums.length];

        int pos = 0;

        int neg = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        // int size = nums.length;
        // int pos[] = new int[size/2];
        // int neg[] = new int[size/2];
        // int retArr[] = new int[size];
        // int posc = 0;
        // int negc = 0;
        // int count = 0;
        // for(int i = 0; i < size; i++)
        // {
        //     if(nums[i] > 0){
        //         pos[posc] = nums[i];
        //         posc++;
        //     }
        //     else{
        //         neg[negc] = nums[i];
        //         negc++;
        //     }
        // }
        // for(int j = 0; j < size; j = j + 2)
        // {
        //     retArr[j] = pos[count];
        //     retArr[j+1] = neg[count];
        //     count++;
        // }
        // return retArr;
        return ans;
    }
}