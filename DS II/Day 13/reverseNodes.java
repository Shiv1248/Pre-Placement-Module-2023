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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
        return null;
        int j = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            j++;
        }
        ListNode prev = null, curr = head, next = null;
        int i = 0;
        while(curr != null && i < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(next != null && j - i >= k){
            head.next = reverseKGroup(next, k);
        }else{
            head.next = next;
        }
        return prev;
    }
}