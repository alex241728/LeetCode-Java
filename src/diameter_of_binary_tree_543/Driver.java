package diameter_of_binary_tree_543;

import libraries.tree.binary_tree.TreeNode;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();
    TreeNode root;

    /*
      Input: root = [1,2,3,4,5]
      Output: 3
      Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
    */
    root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
    System.out.println(s.diameterOfBinaryTree(root));

    /*
      Input: root = [1,2]
      Output: 1
    */
    root = new TreeNode(1, new TreeNode(2), null);
    System.out.println(s.diameterOfBinaryTree(root));
  }
}
