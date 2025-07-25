class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for(int i = 1; i < prices.length; i++){
            int price = prices[i];
            if(price < buy){
                buy = price;
            }
            if((price - buy) > sell){
                sell = price - buy;
            }
        }
        return sell;
    }
   
}