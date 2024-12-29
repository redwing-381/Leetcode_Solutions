class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int i, half = nums.length/2, j=0;
        for(i = 0; i < nums.length; i+=2) {
            shuffled[i] = nums[j];
            shuffled[i+1] = nums[j+++half];
        }
        return shuffled;
    }
}