class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        permutations(0,nums,list,new ArrayList<>(),new boolean[nums.length]);
        return list;
    }
    public void permutations(int index,int nums[],List<List<Integer>> list,List<Integer> ll,boolean[] bol){
        if(ll.size()==nums.length){
            list.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i-1]==nums[i]&&!bol[i-1])
               continue;
            if(!bol[i]){
                bol[i] = true;
            ll.add(nums[i]);
            permutations(1+i,nums,list,ll,bol);
            ll.remove(ll.size()-1);
                bol[i] = false;
    }
}
    }
}