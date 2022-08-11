/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        int count1 = 0;
        while(temp1!=null)
        {
            count1++;
            temp1 = temp1.next;
        }
        int count2 = 0;
        while(temp2!=null)
        {
            count2++;
            temp2 = temp2.next;
        }
        
         temp1 = headA;
         temp2 = headB;
        
        if(count1<count2)
        {
            int diff = count2-count1;
            while(diff!=0)
            {
                temp2 = temp2.next;
                diff--;
            }
        }else if(count1>count2)
        {
            int diff = count1-count2;
            while(diff!=0)
            {
                temp1 = temp1.next;
                diff--;
            }
        }
        
        while(temp1!=null)
        {
            if(temp1==temp2)
            {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
    }
}