class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            if(!st.add(num)) return true;
        }
        return false;
    }
}