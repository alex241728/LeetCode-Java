package diameter_of_binary_tree_543;

import libraries.tree.binary_tree.TreeNode;

class Solution {
  public int diameterOfBinaryTree(TreeNode root) {
    int[] maxDiameter = new int[1];
    height(root, maxDiameter);
    return maxDiameter[0];
  }

  private static int height(TreeNode root, int[] maxDiameter) {
    if (root == null) {
      return 0;
    }

    int left = height(root.left, maxDiameter);
    int right = height(root.right, maxDiameter);
    maxDiameter[0] = Math.max(maxDiameter[0], left + right);
    return Math.max(left, right) + 1;
  }
}
