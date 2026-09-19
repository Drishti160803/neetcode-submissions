class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            // The height of the water is limited by the shorter line
            int currentHeight = Math.min(height[left], height[right]);
            
            // The width is the distance between the two pointers
            int width = right - left;
            
            // Calculate the current area and update maxWater if it's larger
            int currentWater = currentHeight * width;
            maxWater = Math.max(maxWater, currentWater);
            
            // Move the pointer that points to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
