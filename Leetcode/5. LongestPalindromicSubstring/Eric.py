import math


class Solution:
    def getMax(self, total_len, index, s, max_s, tmp_s, even):
        half = math.ceil(total_len / 2)
        for j in range(1, half):
            if (index - j >= 0) and (index + j + even < total_len):
                if s[index-j] == s[index+j+even]:
                    tmp_s = s[index-j] + tmp_s + s[index+j+even]
                else:
                    break
            else:
                break
        if len(tmp_s) > len(max_s):
            max_s = tmp_s

        return max_s

    def longestPalindrome(self, s: str) -> str:
        max_s = ''
        tmp_s = ''
        total_len = len(s)
        for i in range(total_len):
            tmp_s = s[i]
            # 홀수인 경우
            max_s = self.getMax(total_len, i, s, max_s, tmp_s, 0)

            next_index = i+1
            if next_index < total_len and s[i] == s[next_index]:
                tmp_s = s[i]*2
                # 짝수인 경우
                max_s = self.getMax(total_len, i, s, max_s, tmp_s, 1)

        return max_s


sol = Solution()
# print(sol.longestPalindrome('aacabdkacaa'))  # aca
# print(sol.longestPalindrome('ccc'))  # ccc
# print(sol.longestPalindrome('babad'))  # bab
# print(sol.longestPalindrome('cbbc'))  # bb
print(sol.longestPalindrome('cbdeqqedbc'))  # bb
