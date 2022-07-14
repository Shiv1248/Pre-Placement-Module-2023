class Solution {
    public int searchInsert(int[] nums, int target) {
        int l,m,h;
        l=0;
        h=nums.length-1;
        while(l<=h)
        {
            m=l+(h-l)/2;
           
            if(nums[m]==target)
            return m;
            if(nums[m]>target)
            {
                h=m-1;
                
            }
           else
               l=m+1;
       }
        return l;
    }
}

 