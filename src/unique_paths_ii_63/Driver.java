package unique_paths_ii_63;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();

    int[][] obstacleGrid;

    /*
     Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
     Output: 2
     Explanation: There is one obstacle in the middle of the 3x3 grid above.
     There are two ways to reach the bottom-right corner:
     1. Right -> Right -> Down -> Down
     2. Down -> Down -> Right -> Right
    */
    obstacleGrid = new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    System.out.println(s.uniquePathsWithObstacles(obstacleGrid));

    /*
      Input: obstacleGrid = [[0,1],[0,0]]
      Output: 1
    */
    obstacleGrid = new int[][] {{0, 1}, {0, 0}};
    System.out.println(s.uniquePathsWithObstacles(obstacleGrid));
  }
}
