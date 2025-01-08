class Solution(object):
    def isPrefixAndSuffix(self, str1, str2):
        n = len(str1)
        if (str1 == str2[:n] and str1 == str2[len(str2)-n:]):
            return True
        return False

    def countPrefixSuffixPairs(self, words):
        res = 0
        for i in range(len(words)):
            for j in range(i+1, len(words)):
                if self.isPrefixAndSuffix(words[i], words[j]): 
                    res += 1
        return res
