package search_in_a_binary_search_tree_700;

import libraries.tree.binary_tree.TreeNode;

class Driver {
  public static void main(String[] args) {
    Solution s = new Solution();
    TreeNode root =
        new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));

    /*
      Input: root = [4,2,7,1,3], val = 2
      Output: [2,1,3]
    */
    System.out.println(TreeNode.levelOrder(s.searchBST(root, 2)));

    /*
      Input: root = [4,2,7,1,3], val = 5
      Output: []
    */
    System.out.println(TreeNode.levelOrder(s.searchBST(root, 5)));
  }
}
