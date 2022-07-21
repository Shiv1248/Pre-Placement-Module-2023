class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    String forRow = "Row Is " + i + " Value Is " + c;
                    String forCol = "Col Is " + j + "Value Is " + c;
                    String forBlock = "For Value "+ c + "Block Is " + i / 3 + " - " + j / 3;
					
                    if (s.contains(forBlock) || s.contains(forRow) || s.contains(forCol)) {
                        return false;
                    } else {
                        s.add(forBlock);
                        s.add(forCol);
                        s.add(forRow);
                    }

                }
            }
        }
        return true;  
    }
}