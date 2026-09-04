class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int maxLeft = Integer.MIN_VALUE;
            for (int l = 0; l <= i; l++) {
                maxLeft = Math.max(maxLeft, nums[l]);
            }
            int minRight = Integer.MAX_VALUE;
            for (int r = i; r < n; r++) {
                minRight = Math.min(minRight, nums[r]);
            }
            if (maxLeft - minRight <= k) {
                return i;
            }
        }
        return -1;
    }
}