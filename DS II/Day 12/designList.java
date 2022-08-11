class MyLinkedList {

    ListNode head;
    ListNode tail;
    int length;
    
    public class ListNode {
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public MyLinkedList() {
        head=null;
        tail=null;
        length=0;
    }
    
    public int get(int index) {
        //  if(head==null )
        //     return -1;
        // else if(index>length-1)
        //     return -1;
        // else{
            int pos=0;
            ListNode temp=head;
            while(temp!=null)
            {
                if(pos==index)
                    return temp.data;
                temp=temp.next;
                pos++;
            }
            return -1;
       // }
    }
    
    public void addAtHead(int val) {
        ListNode newNode= new ListNode(val);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
        length++;
        
       
    }
    
    public void addAtTail(int val) {
         ListNode newNode= new ListNode(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
           tail.next=newNode; 
        }
        newNode.previous=tail;
        tail=newNode;
        length++;
        
    }
    
    public void deleteFirst() {
        if (length==0)
            return;
        else {
            if (head == tail)
                tail = null;
            else
                head.next.previous = null;
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            length--;
        }
    }
    
    public void deleteLast() {
        if (length==0)
            return;
        else {
            if (head == tail)
                head = null;
            else
                tail.previous.next = null;
            ListNode temp = tail;
            tail = tail.previous;
            temp.previous = null;
            length--;
        }
    }
    
    public void addAtIndex(int index, int val) {
        
         if(index>length)
            return;
        else if(head==null || index==0)
            addAtHead(val);
        else if(index==length)
            addAtTail(val);
        else
        {
            ListNode newNode= new ListNode(val);
            ListNode temp= head;
            int counter=1;
            while(counter<index)
            {
                temp=temp.next;
                counter++;
            }
            temp.next.previous=newNode;
            newNode.next=temp.next;
            newNode.previous=temp;
            temp.next=newNode;
            length++;
        }

    }
    
    public void deleteAtIndex(int index) {
          if(head==null || index==0)
            deleteFirst();
        else if(index>length-1)
            return;
        else if(index==length-1)
            deleteLast();
        else
        {
            ListNode temp= head;
            int counter=1;
            while(counter<index)
            {
                temp=temp.next;
                counter++;
            }
            ListNode deleted= temp.next;
            temp.next=temp.next.next;
            deleted.next.previous=temp;
            deleted.next=null;
            deleted.previous=null;
            length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */