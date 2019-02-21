public class Solution {
    /**
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int difference = Integer.MAX_VALUE;

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int difference = Math.abs(nums[left] + nums[right] - target);

            if (difference < result) {
                result = difference;
            }

            if (nums[left] + nums[right] <= target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            }
        }
        
        return result;
    }
}