public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] nums) {
        // write your code here

        if (nums == null || nums.length == 0) {
            return;
        }

        quickSort(nums, 0, nums.length - 1);

    }

    private void quickSort(
        int[] nums, int start, int end){
        if (start >= end) {
            return;
        }

        int left = start, right = end;
        int target = nums[(left + right) / 2];

        while (left <= right) {
            
            while (left <= right && nums[left] < target) {
                left++;
            }
            while (left <= right && nums[right] > target) {
                right--;
            }

            if (left <= right) {
                int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                left++;
                right--;
            }

            quickSort(nums, start, right);
            quickSort(nums, left, end);
        }

    }
}