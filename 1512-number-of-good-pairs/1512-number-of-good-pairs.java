class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0, len = nums.length;
        for (int i = 0; i < len; i++){
            for (int j = i+1 ; j < len; j++){
                if (nums[i] == nums[j]) goodPairs++;
            }
        }
        return goodPairs;
    }
}