import re


class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.lstrip().split(' ')[0]
        if len(s) == 0:
            return 0
        mul = 1
        if s[0] in ['+', '-']:
            if s[0] == '-':
                mul = -1
            if len(s) <= 1:
                return 0
            s = s[1:]
        pattern = '[a-zA-Z+-. ]'
        if re.findall(pattern, s):
            s = re.split(pattern, s)[0]
            if len(s) == 0:
                return 0
        result = mul * int(s)
        if result < -2**31:
            return -2**31
        if result > 2**31-1:
            return 2**31-1
        return result


print(Solution().myAtoi(''))  # 0
print(Solution().myAtoi(' '))  # 0
print(Solution().myAtoi('42'))  # 42
print(Solution().myAtoi('      -42'))  # -42
print(Solution().myAtoi('words and 987'))  # 0
print(Solution().myAtoi("-91283472332"))  # -2147483648
print(Solution().myAtoi("3.14159"))  # 3
print(Solution().myAtoi("+"))  # 0
print(Solution().myAtoi("+-3"))  # 0
print(Solution().myAtoi("  -0012a42"))  # -12
