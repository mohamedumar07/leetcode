class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int price = 0;
        for(int i = 1; i < prices.length; i++){
            price = prices[i];
            if(price < buy){
                buy = price;
            }
            else if((price - buy) > sell){
                sell = price - buy;
            }
        }
        return sell;
    }
   
}