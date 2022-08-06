class Solution {
    public boolean canJump(int[] nums) {
        int successJumpPt=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=successJumpPt)
                successJumpPt=i;
        }
        return 0==successJumpPt;
    }
}