package minimum_path_sum_64;

class Solution {
  public int minPathSum(int[][] grid) {
    int numRow = grid.length;
    int numCol = grid[0].length;

    int[] aboveRow = new int[numCol];
    aboveRow[0] = grid[0][0];
    for (int j = 1; j < numCol; j++) {
      aboveRow[j] = grid[0][j] + aboveRow[j - 1];
    }

    for (int i = 1; i < numRow; i++) {
      int[] currentRow = new int[numCol];
      currentRow[0] = aboveRow[0] + grid[i][0];
      for (int j = 1; j < numCol; j++) {
        currentRow[j] = grid[i][j] + Math.min(currentRow[j - 1], aboveRow[j]);
      }
      aboveRow = currentRow;
    }

    return aboveRow[numCol - 1];
  }
}
