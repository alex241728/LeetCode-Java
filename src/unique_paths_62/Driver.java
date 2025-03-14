package unique_paths_62;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();

    /*
     Input: m = 3, n = 7
     Output: 28
    */
    System.out.println(s.uniquePaths(3, 7));

    /*
      Input: m = 3, n = 2
      Output: 3
      Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
      1. Right -> Down -> Down
      2. Down -> Down -> Right
      3. Down -> Right -> Down
    */
    System.out.println(s.uniquePaths(3, 2));
  }
}
