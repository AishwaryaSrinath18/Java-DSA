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

// Here to find the middle element we dont know the count so using hare 
// and tortoise algorithm(Floyd's)
// If one pointer goes 2places another goes 1place
// While slow pointer reaches the middle simultaneously the fast pointer /// will reach end. So returning the slow pointer

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
