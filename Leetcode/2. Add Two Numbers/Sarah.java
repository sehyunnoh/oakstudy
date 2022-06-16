//recursion을 이용한 방법
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbers(l1, l2, 0);//반올림해주는 roundUpBit값을 추가해줌
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int roundUpBit) {
		if (l1 == null && l2 == null && roundUpBit == 0) { //마지막 끝나는 조건
			return null;
		} 
		
		int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val) + roundUpBit; //없는 값은 0으로 채워 계산
		ListNode node = new ListNode(sum%10); 
		node.next = addTwoNumbers((l1==null?null:l1.next), (l2==null?null:l2.next), sum/10);//없는값은 null로 전달
		return node;
	}
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        // 실행시간을 줄이기 위해 while loop를 적게 돌도록 코드를 수정한 버전 
        int roundUpBit = 0, l1val=0, l2val=0;
        ListNode result = new ListNode();
        ListNode resultPtr = null, resultNode = null;
        resultPtr = result;

        while (l1 != null && l2 != null) { //두 노드가 모두 있는 경우만 우선 계산	
            l1val = l1.val;
            l1 = l1.next;
            l2val = l2.val;
            l2 = l2.next;

            resultNode = new ListNode((l1val + l2val + roundUpBit)%10);
            roundUpBit = (l1val + l2val + roundUpBit) / 10;

            resultPtr.next = resultNode;
            resultPtr = resultPtr.next;

        }
        if (l1 == null) { //남아있는 노드가 l2일때
            while (l2 != null) {
                l2val = l2.val;
                l2 = l2.next;
                resultNode = new ListNode((l2val + roundUpBit)%10);
                roundUpBit = (l2val + roundUpBit) / 10;

                resultPtr.next = resultNode;
                resultPtr = resultPtr.next;
            }
        } else { //남아있는 노드가 l1일때
            while (l1 != null) {
                l1val = l1.val;
                l1 = l1.next;
                resultNode = new ListNode((l1val + roundUpBit)%10);
                roundUpBit = (l1val + roundUpBit) / 10;

                resultPtr.next = resultNode;
                resultPtr = resultPtr.next;
            }
        }

        if (roundUpBit > 0) { //마지막에 남은 반올림
            resultNode = new ListNode(roundUpBit);
            resultPtr.next = resultNode;
        }

        return result.next;
    }
