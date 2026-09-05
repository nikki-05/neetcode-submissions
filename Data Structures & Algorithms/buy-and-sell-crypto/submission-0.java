class Solution {
    public int maxProfit(int[] prices) {
         int maxProfit = 0;
         int n= prices.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    int currentProfit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, currentProfit);
                }
            }
        }

        return maxProfit;
        
    }
}
