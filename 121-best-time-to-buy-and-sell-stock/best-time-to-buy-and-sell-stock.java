class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min = prices[0];

        int temp = 0;

        for(int i = 1; i < prices.length; i++)
        {

            temp = prices[i];
            if(temp < min)
            {
                min = temp;
            }else if((temp - min) > max_profit){
                max_profit = temp - min;
            }
        }

        return max_profit;
    }
}