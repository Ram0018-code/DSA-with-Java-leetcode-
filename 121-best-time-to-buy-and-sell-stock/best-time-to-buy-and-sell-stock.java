class Solution {
    public int maxProfit(int[] prices) {
        int buyp = prices[0];
        int profit = 0;
        for (int i = 1; i<prices.length; i++){
            if ( buyp>prices[i]){
                buyp = prices[i];
            }
            else {
                int currp = prices[i]- buyp;
                profit = Math.max (profit , currp);
            }
        }
        return profit;
    }
}