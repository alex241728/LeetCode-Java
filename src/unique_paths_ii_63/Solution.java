package unique_paths_ii_63;

class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid[0][0] == 1) {
      return 0;
    }

    int numCol = obstacleGrid[0].length;

    int[] row = new int[numCol];
    row[0] = 1;
    for (int[] r : obstacleGrid) {
      for (int j = 0; j < numCol; j++) {
        if (r[j] == 1) {
          row[j] = 0;
        } else if (j > 0) {
          row[j] += row[j - 1];
        }
      }
    }
    return row[numCol - 1];
  }
}
