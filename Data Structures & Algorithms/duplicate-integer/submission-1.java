class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length -1;i++){
            int left = i;
            int right = i + 1;
            if(nums[left] == nums[right]) return true;
        }
        return false;
    }
}