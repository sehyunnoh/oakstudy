class Solution:

    def lengthOfLongestSubstring(self, s: str) -> int:
        max_s = ''
        tmp_s = ''
        for x in s:
            if x not in tmp_s:
                tmp_s += x
            else:
                # tmp_s이 max_s보다 길면 update
                if len(tmp_s) > len(max_s):
                    max_s = tmp_s[:]
                # tmp_s update 해주기 (중복되는 코드 이후부터 남기고 concatenate)
                tmp_s = tmp_s.split(x)[1] + x
        return max(len(max_s), len(tmp_s))



sol = Solution()
print(sol.lengthOfLongestSubstring('abcabcbb'))  # 3
print(sol.lengthOfLongestSubstring('bbbbb'))  # 1
print(sol.lengthOfLongestSubstring('pwwkew'))  # 3
print(sol.lengthOfLongestSubstring('abcde'))  # 5
print(sol.lengthOfLongestSubstring('aab'))  # 2
print(sol.lengthOfLongestSubstring('dvdf'))  # 3
