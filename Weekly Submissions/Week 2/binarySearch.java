class Solution {
    public int search(int[] nums, int target) {
        int l,m,h,x=-1;
        l= 0;
        h= nums.length-1;
        
        while(l<=h)
        {
         m=(l+h)/2;
            if(target<nums[m])
            {
                h=m-1;
            }
            if(target>nums[m])
            {
                l=m+1;
            }
            if(target==nums[m])
            {
                
                x=m;
                break;
            }
        }
        return x;
    }
}