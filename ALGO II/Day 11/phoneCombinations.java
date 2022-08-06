class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
return new ArrayList();
}
HashMap<Character, String> map = new HashMap<>();
map.put('2', "abc");
map.put('3',"def");
map.put('4',"ghi");
map.put('5',"jkl");
map.put('6',"mno");
map.put('7',"pqrs");
map.put('8',"tuv");
map.put('9',"wxyz");
ArrayList ans = new ArrayList<>();
answer(digits, map, 0, new StringBuilder(), ans);
return ans;
}
public void answer(String given, HashMap<Character, String> map, int s, StringBuilder sb, List x){
if(s == given.length()){
x.add(sb.toString());
return;
}
for(int j=0;j<map.get(given.charAt(s)).length();j++){
sb.append(map.get(given.charAt(s)).charAt(j));
answer(given, map, s+1, sb, x);
sb.deleteCharAt(sb.length()-1);
}
    }
}