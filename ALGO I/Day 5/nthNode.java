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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || n == 0) return head.next;
        int cnt=0;
        ListNode ptr=head.next;
        while(ptr != null) {
            cnt++;
            ptr=ptr.next;
        }
        if(cnt+1 == n){
            return head.next;
        }
        if(cnt==1){
            head.next=null;
            return head;
        }
        if(cnt == n){
            head.next=head.next.next;
            return head;
        }
        n=cnt-n;
        int i=0;
        ptr=head.next;
        while(i<n-1){
            ptr=ptr.next;
            i++;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}