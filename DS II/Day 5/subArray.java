class Solution {
    public int subarraySum(int[] nums, int k) {
              int ans=0;
      Map<Integer,Integer> freq_map=new HashMap<>();
      freq_map.put(0,1);
      int prefix_sum=0;
      for(int i=0;i<nums.length;i++){
          prefix_sum+=nums[i];
          if(freq_map.containsKey(prefix_sum-k)){
              ans+=freq_map.get(prefix_sum-k);
          }
          if(freq_map.containsKey(prefix_sum)){
                freq_map.put(prefix_sum,freq_map.get(prefix_sum)+1);
          }
          else{
              freq_map.put(prefix_sum,1);
          }
          
      }
        return ans;

    }
}