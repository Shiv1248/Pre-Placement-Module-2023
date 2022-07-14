class Solution {
    public void rotate(int[] nums, int k) {
        int i,j;
        int a[]=new int[nums.length];
        j=0;
        for(i=0;i<nums.length;i++)
        {
            a[(i+k)%nums.length]=nums[i];
        }
        for(i=0;i<a.length;i++)
        {
            nums[i]=a[i];
        }   
    }
}s