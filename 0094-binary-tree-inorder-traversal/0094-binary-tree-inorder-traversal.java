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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        TreeNode node = root;
        ArrayList<Integer> inorder = new ArrayList<>();

        while(true){
            if(node != null){
                stk.push(node);
                node = node.left;
            }else{
                if(stk.isEmpty()){
                    break;
                }
                node = stk.pop();
                inorder.add(node.val);
                node = node.right;
            }
        } 
        return inorder;
    }
}