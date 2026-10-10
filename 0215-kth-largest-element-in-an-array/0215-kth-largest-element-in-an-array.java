class Solution {
    public int findKthLargest(int[] nums, int K) {
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
        int pivot = A[l];
        while (l < r) {
            while (l < r && A[r] <= pivot) r--;
            A[l] = A[r];
            while (l < r && A[l] >= pivot) l++;
            A[r] = A[l];
        }
        A[l] = pivot;
        return l;
    }
}