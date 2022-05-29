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
        List<Integer> returnn = new ArrayList<>();

        traverse(returnn, root);
        return returnn;
    }

    public void traverse(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(list, root.left);
        list.add(root.val);
        traverse(list, root.right);
    }
}
