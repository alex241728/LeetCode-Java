package binary_tree_in_order_traversal_94;

import libraries.tree.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inorder = new ArrayList<>();
    inorder(root, inorder);
    return inorder;
  }

  private static void inorder(TreeNode root, List<Integer> inorder) {
    if (root == null) {
      return;
    }
    inorder(root.left, inorder);
    inorder.add(root.val);
    inorder(root.right, inorder);
  }
}
