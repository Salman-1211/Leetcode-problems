class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) dp[i][i] = piles[i]; // Base case

        for (int length = 2; length <= n; length++) { // Length of subarray
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                dp[i][j] = Math.max(piles[i] - dp[i+1][j], piles[j] - dp[i][j-1]);
            }
        }

        return dp[0][n-1] > 0; // Alice wins if the score difference is positive
    }
}