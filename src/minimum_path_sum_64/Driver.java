package minimum_path_sum_64;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();

    /*
     Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
     Output: 7
     Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
    */
    System.out.println(s.minPathSum(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));

    /*
     Input: grid = [[1,2,3],[4,5,6]]
     Output: 12
    */
    System.out.println(s.minPathSum(new int[][] {{1, 2, 3}, {4, 5, 6}}));
  }
}
