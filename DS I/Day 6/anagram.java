class Solution {
    public boolean isAnagram(String s, String t) {
        
        for(int i = 0; i < t.length(); i++){
            int index = s.indexOf(t.charAt(i));
            if( index == -1)
                return false;
            else
                s = s.substring(0,index) + s.substring(index+1);
        }
        if(s.length()==0)
        return true;
        else
            return false;

   

    }
}