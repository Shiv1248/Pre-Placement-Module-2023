class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> comb = new ArrayList<>();
        backtrack(n, k, 1, comb, ans);
        return ans;
    }
    
    public void backtrack(int n, int k, int start, ArrayList<Integer> comb, ArrayList<List<Integer>> ans){
        
        if(comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i <= n; i++){
            comb.add(i);
            backtrack(n, k, i + 1, comb, ans);
            comb.remove(comb.size() - 1);
        }
    }
}