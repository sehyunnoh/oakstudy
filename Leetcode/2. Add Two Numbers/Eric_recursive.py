from typing import Optional


# Definition for singly-linked list.
class ListNode:

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:

    def addTwoNumbers(self, l1: Optional[ListNode],
                      l2: Optional[ListNode]) -> Optional[ListNode]:
        return self.atn(l1, l2, 0)

    def atn(self, l1, l2, n):
        if (l1 == None and l2 == None and n == 0):
            return
        sum = (l1.val if l1 else 0) + (l2.val if l2 else 0) + n
        node = ListNode(sum % 10)
        node.next = self.atn(l1.next if l1 and l1.next else None,
                             l2.next if l2 and l2.next else None, sum // 10)
        return node


def makeNodeFromStr(string: Optional[str]):
    node = None
    for x in string[::-1]:
        new_node = ListNode(int(x), node)
        node = new_node
    return node


sol = Solution()
node = sol.addTwoNumbers(makeNodeFromStr("243"), makeNodeFromStr('564'))
# node = sol.addTwoNumbers(makeNodeFromStr('9999999'), makeNodeFromStr('9999'))
print(node)