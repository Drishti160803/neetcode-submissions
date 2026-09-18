class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    l.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 💡 Yeh saare loops sirf tabhi chalenge jab sum == 0 hoga!
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                // 💡 Agar sum 0 nahi hai, toh purana logic check hoga
                else if (sum < 0) {
                    left++; // Sum chhota hai toh sirf left badhao
                } else {
                    right--; // Sum bada hai toh sirf right kam karo
                }
            }
        }

            return l;
        }
    }
