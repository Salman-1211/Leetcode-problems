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
    
    public void preorder(TreeNode root, List<Integer> arr) {
        
        // If the current node is NULL
        // (base case for recursion), return
        if(root == null){
            return;
        }
        
        // Push the current node's
        // value into the vector
        arr.add(root.val);
        
        // Recursively traverse
        // the left subtree
        preorder(root.left,arr);

        // Recursively traverse 
        // the right subtree
        preorder(root.right,arr);
}
    
    // Function to initiate preorder traversal
    // and return the resulting list

     public List<Integer> preorderTraversal(TreeNode root) {
        
        // Create an empty list to
        // store preorder traversal values
        List<Integer> arr = new ArrayList<>();
        
        // Call the preorder traversal function
        preorder(root, arr);
        
        // Return the resulting list
        // containing preorder traversal values
        return arr;
    }
}