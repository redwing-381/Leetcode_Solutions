class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, prev = 0;
        for(int i : gain){
            if (prev + i > max) max = prev + i;
            prev = prev + i;
        }
        return max;
    }
}