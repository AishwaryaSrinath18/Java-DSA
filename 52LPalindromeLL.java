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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        while(fast != null && slow != null){
            if(fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode head){
        ListNode PRV = null, NXT = null;
        ListNode CUR = head;
        while(CUR != null){
            NXT = CUR.next;
            CUR.next=PRV;
            PRV=CUR;
            CUR=NXT;
        }
        return PRV;
    }
}
