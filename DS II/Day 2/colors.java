class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1, start = 0, end = nums.length - 1;
        while(start <= end) {
            if(nums[start] == 0 && i < nums.length) {
                int t = nums[start];
                nums[start] = nums[i];
                nums[i] = t;
                i ++;
                start ++;
            }
            else if(nums[start] == 2 &&j >= 0) {
                int t = nums[start];
                nums[start] = nums[j];
                nums[j] = t;
                j --;
                end --;
            }
            else 
                start ++;
    }
}
}