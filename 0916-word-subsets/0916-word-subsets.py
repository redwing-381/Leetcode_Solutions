class Solution:
    def wordSubsets(self, a: List[str], b: List[str]) -> List[str]:
        z = Counter()
        for t in b:
            for ch,cnt in Counter(t).items():
                z[ch] = max(z[ch], cnt)

        return [s for s in a if Counter(s)>=z]