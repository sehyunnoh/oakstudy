class Solution:
    def convert(self, s: str, numRows: int) -> str:
        arr = []
        for _ in range(numRows):
            arr.append([])

        i = 0
        increase = True
        for x in s:
            arr[i].append(x)

            if numRows > 1:
                if increase:
                    i += 1
                else:
                    i -= 1

                if i in [0, numRows - 1]:
                    increase = not increase

        return ''.join([''.join(x) for x in arr])


# print(Solution().convert('PAYPALISHIRING', 3))
print(Solution().convert('AB', 1))
