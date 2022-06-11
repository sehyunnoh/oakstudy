from typing import List


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        index = len(nums1) // 2
        if len(nums1) % 2 != 0:
            return float(nums1[index])
        else:
            return (nums1[index-1] + nums1[index])/2


print(Solution().findMedianSortedArrays([1, 3], [2]))  # 2.00000
print(Solution().findMedianSortedArrays([1, 2], [3, 4]))  # 2.50000
