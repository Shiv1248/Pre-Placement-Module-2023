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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = 0;
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode l3 = dummy;
        while(l1 != null || l2 != null || carry != 0){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            val = val1 + val2 + carry;
            carry = val/10;
            val = val % 10;
            ListNode node = new ListNode(val);
            l3.next = node;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        l3.next = null;
        return dummy.next;
    }
}