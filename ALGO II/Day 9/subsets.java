class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        ArrayList<Integer>al=new ArrayList<>();
        fn(nums.length-1,al,l,nums);
        return l;
    }
    public void fn(int idx,ArrayList<Integer>al,List<List<Integer>>l,int[] nums){
        
        
        if(idx<0){
            l.add(new ArrayList<>(al));
            return ;
        }
        
        
        al.add(nums[idx]);
        fn(idx-1,al,l,nums);
        al.remove(al.size()-1);
        fn(idx-1,al,l,nums);
    }
}