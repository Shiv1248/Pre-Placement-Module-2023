class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j = i+1;j<n;j++){     
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int i=0;
        while(i<m){
            reverse(matrix[i]); 
            i++;
        } 
    }
    public void reverse(int arr[]){
        int l=0;int h = arr.length-1;
        while(l<=h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;h--;
        }
    }
}