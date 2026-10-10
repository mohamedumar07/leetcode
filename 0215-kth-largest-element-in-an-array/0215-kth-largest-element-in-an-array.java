import java.util.Random;

class Solution {
    public int findKthLargest(int[] nums, int K) {
    Random rand = new Random();
    int len =  nums.length, l = 0, r = len - 1;
    while (l <= r) {
        int mid = helper(nums, l, r);
        if (mid == K - 1) return nums[mid];
        if (mid < K - 1) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return 0;
    }

    private int helper(int[] A, int l, int r) {
        Random rand = new Random();
        int pivotIndex = l + rand.nextInt(r - l + 1); //choosing the random pivot element. it reduces the worst-case performance.
        swap(A, pivotIndex, l);
        int pivot = A[l];
        while (l < r) {
            while (l < r && A[r] <= pivot) 
                r--;
            A[l] = A[r];
            while (l < r && A[l] >= pivot) 
                l++;
            A[r] = A[l];
        }
        A[l] = pivot;
        return l;
    }

    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}