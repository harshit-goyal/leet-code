class Solution {

    public int climbStairs(int n) {
        int dp[] = new int[n + 1];
        return climb(n, dp);
    }

    int climb(int n, int[] dp) {
        if (n < 4) {
            dp[n] = n;
            return n;
        }

        if (dp[n - 1] == 0) {
            dp[n - 1] = climb(n - 1, dp);
        }
        if (dp[n - 2] == 0) {
            dp[n - 2] = climb(n - 2, dp);
        }

        return dp[n - 1] + dp[n - 2];
    }
}
