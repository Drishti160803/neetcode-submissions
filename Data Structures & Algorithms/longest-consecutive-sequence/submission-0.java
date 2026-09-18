class Solution {
    public int longestConsecutive(int[] nums) {
      int n = nums.length;
      int max = 0;
      HashSet<Integer> st = new HashSet<>();
      for(int i = 0;i<n;i++){
       st.add(nums[i]);
      }
      for(int i = 0;i<n;i++){
        int count = 0;
      if(!st.contains(nums[i] -1)){
        count ++;
        int inc = nums[i] + 1;
        while(st.contains(inc)){
            count ++;
            inc = inc + 1;
        }
        max = Math.max(max, count);
      }
      }
      return max;
    }
}
