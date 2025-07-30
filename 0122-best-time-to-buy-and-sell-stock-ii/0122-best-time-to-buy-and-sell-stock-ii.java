class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sum = 0;
        int profit = 0;
        int len = prices.length;
        int temp = 0;
        for(int i = 1; i < len; i++){
            temp = prices[i];
            if(temp < prices[i - 1]){
                sum += profit;
                profit = 0;
                buy = temp;
            }else{
                profit = Math.max(profit, temp - buy);
            }
        }
        sum += profit;
        return sum;
    }
}