class Solution {
    public int findPairs(int[] nums, int k) {
        

        if (nums == null || nums.length == 0) {
            return -1;
        }

        Arrays.sort(nums);
        int result = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            while (left < right 
                    && left + 1 < nums.length 
                    && nums[left] == nums[left + 1]) {
                left++;
            }

            while (left < right 
                    && right - 1 > 0  
                    && nums[right] == nums[right - 1]) {
                right--;
            }

            System.out.printf("left: %d, right: %d, sum=:%d", left, right, nums[left] + nums[right]);

            if (nums[left] + nums[right] == k) {
                result++;
            }
            else if (nums[left] + nums[right] < k) {
                left++;
            }
            else if (nums[left] + nums[right] > k) {
                right--;
            }

        }

        return result;

    }
}