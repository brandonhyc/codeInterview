public int binarySearch(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
        return -1;
    }

    int start = 0, end = nums.length -1;

    while (start + 1 < end) {
        int mid = start + (end - start) /2;
        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            end = mid;
        } else if (nums[mid] < target) {
            start = mid;
        }

    }
    if (nums[start] == target) {
        return start;
    }
    if (nums[end] == target) {
        return end;
    }

    return -1;
}