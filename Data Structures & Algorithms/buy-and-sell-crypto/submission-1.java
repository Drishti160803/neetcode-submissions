class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       HashMap<Integer, Integer> mp = new HashMap<>();
       for(int i = 0;i<n;i++){
        mp.put(i, prices[i]);
       } 
      int max = 0;
      int mintobuy = mp.get(0);
      for(int i = 1; i<n;i++){
        int curr = mp.get(i);
        mintobuy = Math.min(mintobuy, curr);
        max= Math.max(max, curr - mintobuy);

      }
      return max;
    }
}
