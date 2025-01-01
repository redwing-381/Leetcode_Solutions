class Solution {
    public int mySqrt(int x) {
        if ( x == 0 || x == 1) return x;
        int st = 1, ed = x, mid = -1;

        while (st <= ed){
            mid = st + (ed - st)/2;
            if ((long)mid*mid > (long)x) ed = mid - 1;
            else if (mid*mid == x) return mid;
            else st = mid+1;
        }
        return Math.round(ed);
    }
}