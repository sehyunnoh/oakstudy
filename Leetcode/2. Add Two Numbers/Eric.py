from typing import Optional


# Definition for singly-linked list.
class ListNode:

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    def getStrFromNode(self, node: Optional[ListNode]):
        string = ''
        if node:
            while True:
                string += str(node.val)
                if not node.next:
                    break
                node = node.next
        return string

    def makeNodeFromStr(self, string: Optional[str]):
        node = None
        for x in string:
            new_node = ListNode(int(x), node)
            node = new_node
        return node

    def addTwoNumbers(self, l1: Optional[ListNode],
                      l2: Optional[ListNode]) -> Optional[ListNode]:
        f_str = self.getStrFromNode(l1)
        s_str = self.getStrFromNode(l2)
        result_sum = str(int(f_str[::-1]) + int(s_str[::-1]))

        return self.makeNodeFromStr(result_sum)


f_3 = ListNode(3)
f_2 = ListNode(4, f_3)
f_1 = ListNode(2, f_2)

s_3 = ListNode(4)
s_2 = ListNode(6, s_3)
s_1 = ListNode(5, s_2)

sol = Solution()
# f1: 2-> 4 -> 3
# s1: 5 -> 6 -> 4
node = sol.addTwoNumbers(f_1, s_1)
print(node)