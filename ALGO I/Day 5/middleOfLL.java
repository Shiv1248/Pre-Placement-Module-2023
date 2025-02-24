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
    public ListNode middleNode(ListNode head) {
    
        ListNode ptr=head;
        ListNode ans=head;
        while(ptr!=null && ptr.next!=null && ans!=null)
        {
            ptr=ptr.next.next;
            ans=ans.next;
        }
        return ans;
    }
}