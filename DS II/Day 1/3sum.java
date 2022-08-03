class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int num_len=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i =0;i<num_len-2;i++){
            
            if(nums[i]>0){
                break;
            }
            
            if (i > 0 && nums[i] == nums[i - 1]) {             
                continue;
            }

            int start=i+1,end=num_len-1;
            int sum=nums[i];
            while(start<end){
                int temp_sum=sum+nums[start]+nums[end];
                if(temp_sum==0){
                    ans.add(Arrays.asList(nums[i], nums[start++], nums[end--]));
                    while (start < end && nums[start] == nums[start - 1]) start++;  
                    while (start < end && nums[end] == nums[end + 1]) end--;  
                }
                else if(temp_sum<0){
                    start++;
                }
                else{
                    end--;   
                }
            }
        }
        return ans;
    }
}