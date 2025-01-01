class Solution:
    def maxScore(self, s: str) -> int:
        res = 0
        for i in range(1,len(s)):
            left = s[:i]
            right = s[i:] 

            if left.count('0') + right.count('1') > res:
                res = left.count('0') + right.count('1')
        return res