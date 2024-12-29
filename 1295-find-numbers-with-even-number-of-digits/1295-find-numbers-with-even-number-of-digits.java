class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;

        for (int num : nums){
            int digits = 0;
            while (num != 0) {
                digits++;
                num /= 10; 
            }
            if (digits % 2 == 0) res++;
        }
        return res;
    }
}