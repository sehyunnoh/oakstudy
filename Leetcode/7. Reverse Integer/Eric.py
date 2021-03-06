class Solution:
    def reverse(self, x: int) -> int:
        s = str(x)[::-1]
        if s[-1] == '-':
            s = '-'+s[:-1]
        s = int(s)
        return s if (-2**31 <= s <= 2**31 - 1) else 0


print(Solution().reverse(123))
print(Solution().reverse(-123))  # 321- -> -321
print(Solution().reverse(120))  # 21
print(Solution().reverse(0))
print(Solution().reverse(1534236469))
