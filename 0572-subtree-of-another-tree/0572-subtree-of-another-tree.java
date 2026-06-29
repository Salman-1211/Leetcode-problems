/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
          String rootStr    = serialize(root);
        String subRootStr = serialize(subRoot);

        // substring check — O(m + n) with KMP, O(m·n) naive but fast in practice
        return rootStr.contains(subRootStr);
    }

    // Serialize tree to a string with unambiguous delimiters.
    // Format: #val, where '#' marks a node start and ',' separates values.
    // Null nodes are represented as "#null"
    private String serialize(TreeNode node) {
        if (node == null) return ",#null";

        // Pre-order: node value first, then left, then right
        return ",#" + node.val
             + serialize(node.left)
             + serialize(node.right);
    }
}