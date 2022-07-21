class Solution {
    public String reverseWords(String s) {
        int i,j;
        char c;
        String s1="",s2="";
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c!=' ')
                s1=s1+c;
            if(c==' '||i==s.length()-1)
            {
                for(j=s1.length()-1;j>=0;j--)
                {
                    char ch=s1.charAt(j);
                    s2=s2+ch;
                }
                if(i==s.length()-1)
                    s2=s2;
                else
                    s2=s2+' ';
                s1="";
            }
        }
        return s2;
    }
}