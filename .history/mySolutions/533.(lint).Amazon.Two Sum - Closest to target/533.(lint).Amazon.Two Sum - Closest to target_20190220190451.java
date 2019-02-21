public class Solution {
    /**
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here

        if (nums == null|| nums.length == 0) {
            return -1;
        }
        int result = 0;

        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int distance = Math.abs(nums[left] + nums[right] - target);
            if (distance < difference) {
                difference = distance;
            } 
            else if (nums[left] + nums[right] < target) {
                left++;
            }
            else if (nums[left] + nums[right] > target) {
                right--;
            } 
            else {
                System.out.println("error");
                break;
            }
        }

        return difference;
    }
}