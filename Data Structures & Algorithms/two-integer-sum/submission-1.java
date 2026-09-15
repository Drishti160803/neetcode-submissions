class Solution {
    public int[] twoSum(int[] nums, int target) {
        // we can use hashset 
        HashMap<Integer, Integer> st = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            st.put(nums[i], i);
        }
       for(int i = 0;i<nums.length;i++){
        int rem = target - nums[i];
        if(st.containsKey(rem) && st.get(rem) != i){
            return new int[] {i, st.get(rem)};
        }
       }
       return new int[] {-1, -1};
    }
}
