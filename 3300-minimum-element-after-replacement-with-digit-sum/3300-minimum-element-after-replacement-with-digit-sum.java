class Solution {
    public int minElement(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++){
            temp = nums[i];
            int digitSum = 0;
            while (temp != 0){
                digitSum += temp % 10;
                temp /= 10;
            }
            nums[i] = digitSum;
        }

        temp = nums[0];
        for (int i : nums){
            if (i < temp) temp = i;
        }

        return temp;
    }
}