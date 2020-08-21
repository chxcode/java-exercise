package leetcode.tree;

/**
 * @Author: ChangXuan
 * @Decription: 二叉树的最小深度
 * @Date: 21:44 2020/8/21
 **/
public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftLevel = minDepth(root.left);
        int rightLevel = minDepth(root.right);
        return root.left == null || root.right == null ? leftLevel + rightLevel + 1 : Math.min(leftLevel,rightLevel) + 1;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
