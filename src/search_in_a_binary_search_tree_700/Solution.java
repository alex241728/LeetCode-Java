package search_in_a_binary_search_tree_700;

import libraries.tree.binary_tree.TreeNode;

class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    while (root != null) {
      if (root.val == val) {
        return root;
      } else if (root.val < val) {
        root = root.right;
      } else {
        root = root.left;
      }
    }
    return null;
  }
}
