class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        int[] prevModCounts = new int[k];
        
        for (int num : nums) {
            int[] current = new int[k];
            int mod = num % k;
            
            for (int r = 0; r < k; r++) {
                if (prevModCounts[r] == 0) continue;
                int newR = (r * mod) % k;
                current[newR] += prevModCounts[r];
            }
            
            current[mod]++;
            
            for (int r = 0; r < k; r++) {
                result[r] += current[r];
            }
            
            prevModCounts = current;
        }
        
        return result;
    }
}