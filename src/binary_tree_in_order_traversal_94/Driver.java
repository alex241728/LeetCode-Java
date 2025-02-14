package binary_tree_in_order_traversal_94;

import libraries.tree.binary_tree.TreeNode;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();
    TreeNode root;

    /*
      Input: root = [1,null,2,3]
      Output: [1,3,2]
    */
    root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
    System.out.println(s.inorderTraversal(root));

    /*
      Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
      Output: [4,2,6,5,7,1,3,9,8]
    */
    root =
        new TreeNode(
            1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))),
            new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
    System.out.println(s.inorderTraversal(root));

    /*
      Input: root = []
      Output: []
    */
    System.out.println(s.inorderTraversal(null));

    /*
      Input: root = [1]
      Output: [1]
    */
    root = new TreeNode(1);
    System.out.println(s.inorderTraversal(root));
  }
}
