class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n,i,j,k,l=0;
        for(i=0;i<m;i++)
        {
            n=matrix[i].length;
            k=n-1;
            if(target==matrix[i][l]||target==matrix[i][k])
                return true;
            if(target<matrix[i][k])
            {
                int x=0;
                int y=n;
                while(x<=y)
                {
                    int z=(x+y)/2;
                    if(target==matrix[i][z])
                        return true;
                    if(target<matrix[i][z])
                    {
                        y=z-1;
                    }
                    if(target>matrix[i][z])
                    {
                        x=z+1;
                    }
                }
            }
            
        }
        return false;
    }
}