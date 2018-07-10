class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length > 0){
            int min = prices[0];
            for (int i = 1; i < prices.length; i++){
                if ((i == prices.length - 1) & (prices[i-1] <= prices[i])){
                    profit += (prices[i] - min);
                }
                if (prices[i-1] > prices[i]){
                    profit += (prices[i-1] - min);
                    min = prices[i];
                }
            }
        }
        return profit;
    }
}