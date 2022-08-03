class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int curr = 1;
        int currLen = 0;
        int res = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (curr * nums[i] < k) {
                currLen++;
                curr *= nums[i];
                res += currLen;
            }
            else if (nums[i] >= k) {
                currLen = 0;
                curr = 1;
            }
            else {
                while (curr * nums[i] >= k) {
                    curr /= nums[i - currLen];
                    currLen--;
                }
                currLen++;
                curr *= nums[i];
                res += currLen;
            }
        }
        return res;
    }
}