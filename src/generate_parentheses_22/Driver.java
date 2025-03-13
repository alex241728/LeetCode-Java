package generate_parentheses_22;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();

    /*
      Input: n = 3
      Output: ["((()))","(()())","(())()","()(())","()()()"]
    */
    System.out.println(s.generateParenthesis(3));

    /*
      Input: n = 1
      Output: ["()"]
    */
    System.out.println(s.generateParenthesis(1));
  }
}
