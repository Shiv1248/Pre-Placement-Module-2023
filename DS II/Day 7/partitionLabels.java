class Solution {
    public List<Integer> partitionLabels(String s) {
          List<Integer> result = new ArrayList();
        Map<Character, Integer> lastFrequency = new HashMap();
        
        char ch[] = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            lastFrequency.put(ch[i], i);
        }
        
        int end = 0, start = 0;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            end = Math.max(end, lastFrequency.get(c));
            
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
                end += 1;
            }
        }
        
        return result;
    }
}