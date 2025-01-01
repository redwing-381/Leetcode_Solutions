class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        l = 0
        r = num
        while l <= r:
            numbers = (l+r)//2
            if numbers * numbers == num:
                return True
            elif numbers * numbers > num:
                r = numbers - 1
            else: 
                l = numbers + 1
        return False