class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s == null || s.isEmpty())
        {
            return 0;
        }

        ArrayList<Character>list = new ArrayList<Character>();
        int max = 0;
        
        for(int i = 0;i<s.length();i++)
        {
            char tmp = s.charAt(i);
            
            if(!list.contains(tmp))
            {
                list.add(tmp);
            }
            else
            {
                max = Math.max(max,list.size()); //check the max number
                int ii = list.indexOf(tmp);
                
                //list.removeRange(0,ii+1);
                list.subList(0,ii+1).clear();
                
                list.add(tmp);
            }
        }
        
        if(list.size() != 0)
        {
            max = Math.max(max,list.size());  
        }
        
        return max;

    }
}