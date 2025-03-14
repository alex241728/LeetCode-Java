package unique_paths_62;

/* import java.util.HashMap;
import java.util.Map; */

import java.util.Arrays;

class Solution {
  /*
   Better Solution
  */
  public int uniquePaths(int m, int n) {
    int[] aboveRow = new int[n];
    Arrays.fill(aboveRow, 1);

    for (int r = 1; r < m; r++) {
      int[] currentRow = new int[n];
      currentRow[0] = 1;
      for (int c = 1; c < n; c++) {
        currentRow[c] = currentRow[c - 1] + aboveRow[c];
      }
      aboveRow = currentRow;
    }

    return aboveRow[n - 1];
  }

  /* public int uniquePaths(int m, int n) {
    Map<String, Integer> memory = new HashMap<>();
    return searchPath(memory, 1, 1, m, n);
  }

  private int searchPath(Map<String, Integer> memory, int x, int y, int m, int n) {
    if (x == n && y == m) {
      return 1;
    }

    if (x > n || y > m) {
      return 0;
    }

    String key = x + "," + y;
    if (memory.containsKey(key)) {
      return memory.get(key);
    }

    int rightPathNum = searchPath(memory, x + 1, y, m, n);
    int downPathNum = searchPath(memory, x, y + 1, m, n);
    memory.put(key, rightPathNum + downPathNum);
    return memory.get(key);
  } */
}
