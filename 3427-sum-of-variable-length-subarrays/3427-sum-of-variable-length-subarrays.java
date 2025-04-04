class Solution {
    public int subarraySum(int[] nums) {
        int res = 0, sum;

        for (int i = 0; i < nums.length; i++){
            int start = 0 > (i - nums[i]) ? 0 : (i - nums[i]);
            sum = 0;
            while (start <= i){
                sum += nums[start];
                start++;
            }
            res += sum;
        }

        return res;
    }
}