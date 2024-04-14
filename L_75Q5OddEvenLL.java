/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Input: 1 2 3 4 5 6
 * output: 1 3 5 2 4 6/
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No need to process if there are less than two nodes
        }
        ListNode evenHead = head.next;
        ListNode oddCurr = head;
        ListNode evenCurr = evenHead;

        while (oddCurr.next != null && oddCurr.next.next != null) {
            oddCurr.next = oddCurr.next.next;
            oddCurr = oddCurr.next;
            evenCurr.next = oddCurr.next;
            evenCurr = evenCurr.next;
        }

        oddCurr.next = evenHead;
        //if(evenCurr.next != null) evenCurr.next = null;
        return head;
    }
}
