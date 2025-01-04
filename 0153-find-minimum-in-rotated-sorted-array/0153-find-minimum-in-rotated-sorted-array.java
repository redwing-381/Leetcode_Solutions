class Solution {
    public int findMin(int[] nums) {
        return nums[findPivot(nums) + 1];
    }
    
    int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] <= nums[end]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (start < mid){
                if (nums[mid] < nums[mid - 1]){
                    return mid - 1;
                }
            }
            if (mid < end) {
                if (nums[mid] > nums[mid + 1]){
                    return mid;
                }
            }
            if (nums[start] < nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }
}