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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)                      //if the linkedlist is empty
            return null;
        ListNode ptr = head;
        while(ptr.next!=null)
            if(ptr.val == ptr.next.val)     //if present and next value are same
                ptr.next = ptr.next.next;
            else                            //else move to next node
                ptr = ptr.next;
        return head;    
    
    }
}