package leetcode.tree;

/**
 * @ClassName InvertBinaryTree
 * @Description 反转二叉树 https://leetcode-cn.com/problems/invert-binary-tree/
 * @Author changxuan
 * @Date 2020/9/16 下午7:43
 **/
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
