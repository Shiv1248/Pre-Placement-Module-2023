class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,temp;
        for(i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        for(i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j-1]>nums[j])
                {
                    temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}