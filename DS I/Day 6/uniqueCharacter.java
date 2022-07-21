class Solution {
    public int firstUniqChar(String s) {
        char c,ch;
        int i,p=0;
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(j==i)
                    continue;
                if(c==s.charAt(j))
                {
                    p=-1;
                    break;
                }
                else
                {
                    ch=c;
                    p=i;
                }
            }
            if(p!=-1)
                return p;
            
        }
        return p;
    }
}