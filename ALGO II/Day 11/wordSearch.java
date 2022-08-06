class Solution {
    public boolean exist(char[][] board, String word) {
         for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[i].length; j++) {
        if(word.charAt(0) == board[i][j] 
           && exists(board, i, j, word, 0)) {
          return true;
        }
      }
    }
    
    return false;
  }
  
  public boolean exists(char[][] board, int i, int j, String word, 
                        int x) {
    if(x == word.length()) {
      return true;
    }
    
    if(i < 0 || i >= board.length || j < 0 || j >= board[i].length ||
      word.charAt(x) != board[i][j]) {
      return false;
    }
    
    // mark visited temporarily
    char temp = board[i][j];
    board[i][j] = '#';
    
    boolean res = exists(board, i + 1, j, word, x + 1) 
      || exists(board, i - 1, j, word, x + 1)
      || exists(board, i, j + 1, word, x + 1)
      || exists(board, i, j - 1, word, x + 1);
    
    board[i][j] = temp;
    return res;
    }
}