class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<= 1 ) return 0;
        int minbuy = prices[0];
        int maxsell = 0;
        for(int i = 1;i<n;i++){
            int curr = prices[i];
            minbuy = Math.min(minbuy, curr);
            maxsell = Math.max(maxsell, curr - minbuy);
        }
        return maxsell;
    }
}
