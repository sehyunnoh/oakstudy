class Solution:
    def isPalindrome(self, x: int) -> bool:
        s = str(x)
        if len(s) <= 1:
            return True
        else:
            if s[0] == s[-1]:
                return self.isPalindrome(s[1:-1])
            else:
                return False


print(Solution().isPalindrome(121))  # true
print(Solution().isPalindrome(-121))  # false
print(Solution().isPalindrome(10))  # false
