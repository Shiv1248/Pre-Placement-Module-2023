import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i,f=0;
        Arrays.sort(nums);
        if(nums.length==2)
        {
            if(nums[0]==nums[1])
                return true;
        }
        for(i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]==nums[i]||nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}