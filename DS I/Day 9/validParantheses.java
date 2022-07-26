class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else if(isValid(st.peek(),s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        
        return st.empty();
    }
    
    public boolean isValid(char s1, char s2){
        if(s1=='(' && s2==')') return true;
        if(s1=='{' && s2=='}') return true;
        if(s1=='[' && s2==']') return true;
        return false;
    }       
}