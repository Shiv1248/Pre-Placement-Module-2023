class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i,j;
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> a1, x=null;
        for(i=0;i<numRows;i++)
        {
             a1=new ArrayList<>();
           for(j=0;j<=i;j++)
           {
               if(j==0 || j==i)
               a1.add(1);
               else
               {
                   a1.add(x.get(j-1)+x.get(j));
               }
           }
            x=a1;
            a.add(a1);
            
        }
        return a;
    }
}