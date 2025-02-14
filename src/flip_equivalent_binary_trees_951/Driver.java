package flip_equivalent_binary_trees_951;

import libraries.tree.binary_tree.TreeNode;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();
    TreeNode root1;
    TreeNode root2;

    /*
      Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
      Output: true
      Explanation: We flipped at nodes with values 1, 3, and 5.
    */
    root1 =
        new TreeNode(
            1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(7), new TreeNode(8))),
            new TreeNode(3, new TreeNode(6), null));
    root2 =
        new TreeNode(
            1,
            new TreeNode(3, null, new TreeNode(6)),
            new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(8), new TreeNode(7))));
    System.out.println(s.flipEquiv(root1, root2));

    /*
      Input: root1 = [], root2 = []
      Output: true
    */
    System.out.println(s.flipEquiv(null, null));

    /*
      Input: root1 = [], root2 = [1]
      Output: false
    */
    root2 = new TreeNode(1);
    System.out.println(s.flipEquiv(null, root2));
  }
}
