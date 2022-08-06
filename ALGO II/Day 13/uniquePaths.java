class Solution {
    public int uniquePaths(int m, int n) {
        int[][] numOfPaths = new int[m][];
        for (int i = 0; i < m; i++) {
            numOfPaths[i] = new int[n];
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    numOfPaths[i][j] = 1;
                } else {
                    if (i > 0) {
                        numOfPaths[i][j] += numOfPaths[i - 1][j];
                    }
                    if (j > 0) {
                        numOfPaths[i][j] += numOfPaths[i][j - 1];
                    }
                }
            }
        }
        
        return numOfPaths[m - 1][n - 1];
    }
}