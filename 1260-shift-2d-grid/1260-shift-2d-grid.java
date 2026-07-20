class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        // Perform k shifts
        for (int s = 0; s < k; s++) {
            int[][] newGrid = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    // Last element of grid goes to [0][0]
                    if (i == m - 1 && j == n - 1) {
                        newGrid[0][0] = grid[i][j];
                    }
                    // Last column goes to next row first column
                    else if (j == n - 1) {
                        newGrid[i + 1][0] = grid[i][j];
                    }
                    // All others shift right
                    else {
                        newGrid[i][j + 1] = grid[i][j];
                    }
                }
            }
            grid = newGrid;
        }

        // Convert to List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int val : row) rowList.add(val);
            result.add(rowList);
        }
        return result;
    }
}