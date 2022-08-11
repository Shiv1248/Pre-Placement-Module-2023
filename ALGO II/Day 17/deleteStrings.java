class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()][word2.length()];
    for(int row[] : dp) Arrays.fill(row, -1);
    
    // Find max longest common subsequence in both strings
    
    int lcs = sub(word1.length()-1, word1, word2.length()-1, word2, dp);
    
    // Minimum deletions steps will be size of string1 - lcs
    int del = word1.length() - lcs; 
    
    // Minimum insertion steps will be size of string2 - lcs
    int ins = word2.length() - lcs;
    
    // Add then add both deletion and insertions steps
    return del + ins;
}

public int sub(int i, String s, int j, String t, int dp[][]){
    
    if(i < 0 || j < 0) return 0; // If any of index(i,j) reaches negative int, it will return 0
    
    if(dp[i][j] != -1) return dp[i][j];
    
    if(s.charAt(i) == t.charAt(j)){// If i,j character of both strings are same 
        return dp[i][j] = 1 + sub(i-1, s, j-1, t, dp);
    }
    // If character of same indices of both strings are not same
    return dp[i][j] = Math.max(sub(i-1, s, j, t, dp) , sub(i, s, j-1, t, dp));
    }
}