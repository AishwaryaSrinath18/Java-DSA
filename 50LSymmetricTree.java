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
 // Here to check the symmetric we need to consider
 // a single tree as two trees of two nodes and passing it in another function 
 // to check whether the nodes are mirror images of them
 // by comparing the opposite nodes of two trees
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode root1, TreeNode root2){
        if(root1 == null || root2 == null) return root1 == root2;
        return (root1.val == root2.val) && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }
}
