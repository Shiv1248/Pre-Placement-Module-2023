class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int center = (i + j) / 2;
            int centerLeft = (center == 0) ? nums.length - 1 : center - 1;
            if (nums[center] < nums[centerLeft]) {
                return nums[center];
            }
            if (nums[center] >= nums[i] && nums[center] > nums[j]) i = center + 1;
            else j = center - 1;
        }
        return -1;
    }
}