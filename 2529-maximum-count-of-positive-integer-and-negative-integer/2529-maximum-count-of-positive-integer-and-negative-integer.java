class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Find the first positive number
        int posIndex = findFirstPositive(nums);
        // Find the first non-negative number
        int negIndex = findFirstNegative(nums);

        int posCount = n - posIndex;  // Count of positive numbers
        int negCount = negIndex + 1;  // Count of negative numbers

        return Math.max(posCount, negCount);
    }

    private int findFirstPositive(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int findFirstNegative(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
