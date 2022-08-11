class Solution {
    public int integerBreak(int n) {
         double max = 0;
        if (n == 2) {
            max = 1; 
        }
        else {
            for (int k = 2; k < n; k++) {
                int r = n % k;
                double product = (Math.pow (n / k, k - r)) * (Math.pow ((n / k) + 1, r));
                if (product > max) { 
                    max = product; 
                }

            }
            
        }
        return (int) max; 
    }
}