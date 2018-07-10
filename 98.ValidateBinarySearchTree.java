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
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isValidBSTUtil(min, max, root);
    }
    public boolean isValidBSTUtil(long min, long max, TreeNode root){
        if (root == null){
            return true;
        }
        if ((root.val <= min) || (root.val >= max)){
            return false;
        }
        return isValidBSTUtil(min, root.val, root.left) & isValidBSTUtil(root.val, max, root.right);
    }
}