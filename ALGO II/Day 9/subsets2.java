class Solution {
    List<List<Integer>> res = new ArrayList<>();
       
       public List<List<Integer>> subsetsWithDup(int[] nums) {
           List<Integer> list = new ArrayList<>();
           Arrays.sort(nums);
           
           helper(nums, 0, list ); 
           return res;
       }
       
       public void  helper(int [] nums, int index , List<Integer> list )
       {
               
              res.add(new ArrayList<>(list));
           
             for(int i=index; i<nums.length;i++)
              {
               if(i>index && i-1>=0 && nums[i]==nums[i-1] )
                 {
                  continue;
                 }
               list.add(nums[i]);
               helper(nums, i+1, list);
               list.remove(list.size()-1);
           }
       }
   }