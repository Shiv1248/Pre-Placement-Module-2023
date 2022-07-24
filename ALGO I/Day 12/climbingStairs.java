class Solution {
    public int climbStairs(int n) {
         int[] dp = new int[n + 1];
        dp[0] = 0;
        int k = 2;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (j <= k && i - j >= 0) {
                dp[i] += dp[i - j];
                j++;
            } 
            if (i <= k) dp[i] += 1;
        }
        return dp[n];
    }
}