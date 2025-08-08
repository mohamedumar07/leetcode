class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int sum[] = new int[n];
        Arrays.fill(sum, 1);

        for(int i = 1; i <= k; i++){
            for(int j = 1; j < n; j++){
                sum[j] = (sum[j - 1] + sum[j]) % (int)(Math.pow(10, 9) + 7);
            }
        }

        return sum[n - 1];
    }
}