package invert_binary_tree_226;

import libraries.tree.binary_tree.TreeNode;

class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode left = invertTree(root.left);
    root.left = invertTree(root.right);
    root.right = left;
    return root;
  }
}
