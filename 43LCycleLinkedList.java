/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 // here we using two pointers a and b to traverse
 // a moves 1 place 
 // b moves 2 places 
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode a = head; // slow one
        ListNode b = head; // fast one

        while(a!=null && b!=null && b.next!=null){
        // here a should not be null
        // b and next b also should not be null

        a=a.next; // traversing the values
        b=b.next.next;
        if(a==b) return true;
        }
        return false;
    }
}
