/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        while(pointer.next != null && pointer.next.next != null){
            ListNode node1 = pointer.next;
            ListNode node2 = pointer.next.next;
            node1.next = node2.next;
            node2.next = node1;
            pointer.next = node2;
            pointer = node1;
        }
        return dummy.next;
    }
}
