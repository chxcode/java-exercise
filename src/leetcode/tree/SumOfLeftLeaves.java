package leetcode.tree;

/**
 * @ClassName SumOfLeftLeaves
 * @Description 左叶子之和 https://leetcode-cn.com/problems/sum-of-left-leaves/
 * @Author changxuan
 * @Date 2020/9/19 下午8:53
 **/
public class SumOfLeftLeaves {
    // 注意 是叶子之和 非左节点之和
    public int sumOfLeftLeaves(TreeNode root) {
        int[] result = new int[1];
        result[0] = 0;
        sumLeft(root, result);
        return result[0];
    }

    public void sumLeft(TreeNode node, int[] result) {
        if (node == null) return;
        if (node.left != null) {
            if (isLeaf(node)) result[0] += node.left.val;
            sumLeft(node.left, result);
        }
        if (node.right != null) {
            sumLeft(node.right, result);
        }
    }

    public boolean isLeaf(TreeNode node) {
        return node.right == null && node.left == null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
