import java.util.Random;

class Solution {
    public int findKthLargest(int[] nums, int K) {
        int len =  nums.length, l = 0, r = len - 1;
    Random rand = new Random();
    while (l <= r) {
        int pivotIndex = l + rand.nextInt(r - l + 1);
        int mid = partition(nums, l, r, pivotIndex);
        if (mid == len - K) return nums[mid];
        if (mid < len - K) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return 0;
    }

    private static int partition(int nums[], int l, int r, int pI){
        int pivot = nums[pI];
        swap(nums, r, pI); //move pivot far to the right
        int nextStoredIndex = l;

        //if we encounter any values less than pivot, 
        //we swap it to the left side via storedIndex
        for(int i = l; i < r; i++){
            if(nums[i] < pivot){
                swap(nums, nextStoredIndex, i);
                nextStoredIndex++;
            }
        }

        //everything in the left side is smaller than the pivot
        //thus, we will place pivot after the nextStoredIndex
        swap(nums, r, nextStoredIndex);
        return nextStoredIndex;
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}