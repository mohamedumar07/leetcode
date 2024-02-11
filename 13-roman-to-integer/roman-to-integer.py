class Solution:
    def romanToInt(self, s: str) -> int:
        sum = 0
        symbols = {"I" : 1, "V" : 5, "X" : 10, "L" : 50, "C" : 100, "D" : 500, "M" : 1000}
        for c in range(len(s)-1):
            if symbols[s[c]] < symbols[s[c+1]]:
                sum -= symbols[s[c]]
            else:
                sum += symbols[s[c]]
        sum += symbols[s[len(s)-1]]
        return sum
        