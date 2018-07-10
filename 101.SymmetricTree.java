/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirrored(root, root);
    }
    public boolean isMirrored(TreeNode left, TreeNode right){
        if ((left == null) && (right == null)){return true;}
        if (((left == null) && (right != null)) || ((left != null) && (right == null))){return false;}
        if(left.val != right.val){return false;}
        return isMirrored(left.left, right.right) && isMirrored(right.left, left.right);
    }
}