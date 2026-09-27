class Solution {
    public int maxProfit(int[] prices) {
        // using the sliding window or two pointer approach
        int l = 0;
        int r = 1;
        int max = 0;
        while(r < prices.length){
            if(prices[l] <prices[r]){
                int curr = prices[r] - prices[l];
                max = Math.max(max, curr);
            }
            else{
                l = r;
            }
            r++;
        }
        return max;
    }
}
