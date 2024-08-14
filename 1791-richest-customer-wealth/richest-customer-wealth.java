class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum;
        for(int[] person: accounts){
            sum = 0;
            for(int balance: person){
                sum += balance;
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }
}