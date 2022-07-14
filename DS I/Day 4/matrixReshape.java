class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int x=mat.length;
        int y=mat[0].length;
        if(x*y != r * c) {
            return mat;
        }
        int  a=0,b=0;
        int out[][]=new int[r][c];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               if(b==c){
                    b=0;
                    a++;
                }
                out[a][b]=mat[i][j];
                    b++;
             }
        }
        return out;
    }
}