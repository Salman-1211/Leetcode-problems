class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;       // rows count
        int n = grid[0].length;    // columns count
        int total = m * n;         // total cells (our cycle length)

        // Result grid — same size as input
        int[][] result = new int[m][n];

        // ── CORE LOGIC ─────────────────────────────────────
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // STEP 1: Where is this element right now? (2D → 1D)
                // Think of grid as one long array
                // Row 0: positions 0 to n-1
                // Row 1: positions n to 2n-1
                // Row i: positions i*n to i*n+(n-1)
                int pos = i * n + j;

                // STEP 2: Where does it go after k shifts?
                // Add k to current position
                // Use % total to wrap around (cyclic behaviour)
                // Example: last element + 1 shift → goes to position 0
                int newPos = (pos + k) % total;

                // STEP 3: Convert new 1D position back to 2D
                // Integer division → which row?
                // Modulo → which column in that row?
                int newI = newPos / n;
                int newJ = newPos % n;

                // STEP 4: Place element in new position
                result[newI][newJ] = grid[i][j];
            }
        }

        // ── CONVERT TO LIST<LIST<INTEGER>> ─────────────────
        // LeetCode requires this return type
        // int[][] → List<List<Integer>>
        List<List<Integer>> ans = new ArrayList<>();

        for (int[] row : result) {
            List<Integer> rowList = new ArrayList<>();
            for (int val : row) {
                rowList.add(val);   // autoboxing: int → Integer
            }
            ans.add(rowList);
        }

        return ans;
    }
}