class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] b=new boolean[isConnected.length];
        Arrays.fill(b,false);

        int c=0;
        for (int i=0;i<isConnected.length;i++){
            if(!b[i]){
                add(i,b,isConnected);
                c++;

            }
        }
        return c;
    }

    public void add(int i,boolean[] b ,int[][] isConnected){

        b[i]=true;
        for (int j=0;j<isConnected.length;j++){
            if(i!=j&&!b[j]&&isConnected[i][j]==1){
                add(j,b,isConnected);
            }
        }
    }
}