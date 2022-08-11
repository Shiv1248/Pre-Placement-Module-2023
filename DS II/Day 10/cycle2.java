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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){ // ye loop h khali fast travel krne ke liye listwa me 
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){ // yha pe dono bheta gye slow aur fast
                slow = head;    // slow wala wapas chla gya
                
                while(slow != fast){ // ab fast wala aadha rasta travel kr chuka h and slow wala phir se aa rha dono wapas bhetae mtlb loop mil gya
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        
        return null;
    }
}