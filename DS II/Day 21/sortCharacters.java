class Solution {
    public String frequencySort(String s) {
        List<Character>[] freq = new List[s.length()+1];
        for(int i=0;i<=s.length();i++){
            freq[i] = new ArrayList<Character>();
        }
        int[] fmap = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            fmap[ch]++;
        }
        for(int i=0;i<256;i++){
            if(fmap[i]>0){
                freq[fmap[i]].add((char)(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=freq.length-1;i>=1;i--){
            if(freq[i].size()>0){
                for(char ch:freq[i]){
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(fmap)+"|| "+ Arrays.toString(freq));
        return sb.toString();
}


}