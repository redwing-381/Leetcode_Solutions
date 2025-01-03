class Solution {
    public int search(int[] nums, int target) {
        int pivot = searchPivot(nums);
        
        // If no pivot, perform normal binary search on the entire array
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If the pivot element is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is in the left sorted portion
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // If target is in the right sorted portion
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // Element not found
    }

    public static int searchPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the current mid is the pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Adjust the search space
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // No pivot found; array is not rotated
    }
}
