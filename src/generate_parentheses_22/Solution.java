package generate_parentheses_22;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    generate(result, 1, 0, n, "(");
    return result;
  }

  private static void generate(
      List<String> result, int left, int right, int n, String parenthesis) {
    if (left == right && (left + right) == n * 2) {
      result.add(parenthesis);
      return;
    }

    if (left < n) {
      generate(result, left + 1, right, n, parenthesis + "(");
    }

    if (left > right) {
      generate(result, left, right + 1, n, parenthesis + ")");
    }
  }
}
