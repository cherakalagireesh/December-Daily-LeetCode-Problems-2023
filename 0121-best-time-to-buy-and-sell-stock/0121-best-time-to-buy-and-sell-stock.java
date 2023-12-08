class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        int length = prices.length;
        
        for(int i=0;i<length;i++)
        {
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i]-min);
        }
        
        return profit;
    }
}