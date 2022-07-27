class Solution {
    private int getNextIndex(String s, int curr) {
       int back = 0;
       for (int i = curr - 1; i >= 0; i--) {
           if (s.charAt(i) == '#') {
               back++;
               continue;
           }
           if (back > 0) {
               back--;
               continue;
           }
           return i;
       }
       return -1;
   }
   
   public boolean backspaceCompare(String s, String t) {
       int i = s.length(); int j = t.length();
       while (true) {
           i = getNextIndex(s, i);
           j = getNextIndex(t, j);
           if (i == -1 && j == -1) return true;
           if (i == -1 || j == -1) return false;
           if (s.charAt(i) != t.charAt(j)) return false;
       }
   }
}