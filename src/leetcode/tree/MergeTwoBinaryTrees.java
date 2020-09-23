package leetcode.tree;

/**
 * @ClassName MergeTwoBinaryTrees
 * @Description 合并二叉树 https://leetcode-cn.com/problems/merge-two-binary-trees/
 * @Author changxuan
 * @Date 2020/9/23 下午8:00
 **/
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
