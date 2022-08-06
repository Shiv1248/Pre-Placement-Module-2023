class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
         HashMap<Character, Integer> str2int = new HashMap<>();
        str2int.put('A', 0);
        str2int.put('C', 1);
        str2int.put('G', 2);
        str2int.put('T', 3);
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> res = new HashSet<>();
        int[] nums = new int[s.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = str2int.get(s.charAt(i));
        }
        
        int L = 10;
        int R = 4;
        // seq len 10; each seq has 4 possible chars
        int RL = (int) Math.pow(R, L-1);
        int windowHash = 0;
        int left = 0, right = 0;
        while(right < nums.length) {
            windowHash = R * windowHash + nums[right];
            right++;
            if (right - left == L) {
                if (seen.contains(windowHash)) {
                    res.add(s.substring(left, right));
                } else {
                    seen.add(windowHash);
                }
                windowHash = windowHash - nums[left] * RL;
                left++;
            }
        }
        return new LinkedList<>(res);
    }
}