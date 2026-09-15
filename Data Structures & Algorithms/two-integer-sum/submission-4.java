class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // this is the array ans where we store the nummber as well as the index
        int element[][] = new int[n][2];
        for(int i = 0;i<n;i++){
            element[i][0] = nums[i];
            element[i][1] = i;

        }

        Arrays.sort(element,(a,b) -> Integer.compare(a[0], b[0]));
        int left = 0;
        int right = n-1;
        while(left < right){
           int currentSum = element[left][0] + element[right][0];
           if(currentSum == target){
            return new int[]{
                Math.min(element[left][1] , element[right][1]),
                Math.max(element[left][1], element[right][1])
            };
           }
           else if(currentSum < target){
            left ++;
           }
           else{
            right --;
           }
        }
        return new int[] {-1, -1};
    }
}
