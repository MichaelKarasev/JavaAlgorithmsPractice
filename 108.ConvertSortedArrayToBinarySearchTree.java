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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }
    public TreeNode sortedArrayToBSTHelper(int[] nums, int low, int high){
        if (low > high){
            return null;
        }
        TreeNode res = new TreeNode(nums[(low + high)/2]);
        res.left = sortedArrayToBSTHelper(nums, low, (low + high)/2 - 1);
        res.right = sortedArrayToBSTHelper(nums, (low + high)/2 + 1, high);
        return res;
    }
}