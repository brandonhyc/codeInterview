public class Solution {
    /*
     * @param nums: A list of integers
     * @return: nothing
     */
    public void wiggleSort(int[] nums) {
        // write your code here
        if (nums == null || nums.length <= 1) {
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0 && nums[i] >= nums[i + 1]) {
                swap(nums, i, i + 1);
            } else if (i % 2 == 1 && nums[i] <= nums[i + 1]) {
                swap(nums, i, i + 1);
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
    }

}