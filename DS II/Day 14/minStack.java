class MinStack {

    Node top;
     int minElement;
     
     class Node{
         int data;
         Node next;
         Node(int data){
             this.data = data;
         }
     }
 
     public MinStack() {
         
     }
     
     public void push(int val) {
         Node node = new Node(val);
         if(null == top){
             top = node;
             minElement = val;
         }else{
             if(val<minElement){
                 minElement = val;
             }
             node.next = top;
             top = node;
         }
         
     }
     
     public void pop() {
         if(null == top){
             
         }else{
             top = top.next;
             minElement = calculateMinElement();
         }
         
     }
     public int calculateMinElement(){
         int data = Integer.MAX_VALUE;
         Node temp = top;
         while (null != temp) {
             if(temp.data<data){
                 data = temp.data;
             }
             temp = temp.next;
         }
         return data;
     }
     
     public int top() {
         return null != top?top.data:null;
     }
     
     public int getMin() {
         return minElement;
     }
 }
 
 /**
  * Your MinStack object will be instantiated and called as such:
  * MinStack obj = new MinStack();
  * obj.push(val);
  * obj.pop();
  * int param_3 = obj.top();
  * int param_4 = obj.getMin();
  */