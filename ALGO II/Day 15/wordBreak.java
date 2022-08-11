class Solution {
    Map<String, Boolean> memo = new HashMap<String, Boolean>();

   public boolean wordBreak(String s, List<String> wordDict) {
       if(s.length() == 0) {
           return true;
       }
       //System.out.printf("Current String %s\n", s);
       if(memo.containsKey(s) == true) {
           return memo.get(s);
       }
       boolean found = false;
       for(String word : wordDict) {
           if(s.indexOf(word) == 0) {
               // System.out.printf("\tfound `%s` prefix",word);
               String rest = s.substring(word.length(), s.length());
               // System.out.printf(" looking for `%s` now\n", rest);
               found = wordBreak(rest, wordDict);
               if(found == true) {
                   memo.put(s.substring(word.length(), s.length()), found);
                   return true;
               }
           }
       }
       memo.put(s, false);
       return false;
   }
}