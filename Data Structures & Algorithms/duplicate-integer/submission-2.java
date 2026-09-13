class Solution {
    public boolean hasDuplicate(int[] nums) {
        // we can do this by saying the frequency of the nums array
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it: mp.entrySet()){
            if(it.getValue() > 1) return true;
        }
        return false;
    }
}