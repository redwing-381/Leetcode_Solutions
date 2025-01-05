class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        count = 0
        val = 1
        while count < k:
            if val not in arr:
                count += 1
            val +=1
        return val - 1