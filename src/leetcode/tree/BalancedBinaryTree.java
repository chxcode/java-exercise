package leetcode.tree;

/**
 * @ClassName BalancedBinaryTree
 * @Description 平衡二叉树
 * @Author changxuan
 * @Date 2020/8/17 下午8:20
 **/
public class BalancedBinaryTree {
    // 改造一下 求二叉树深度的算法，发现两个节点相差大于1时返回-1 一直往外返回，判断最终返回值
    public boolean isBalanced(TreeNode root) {
        if (maxDepth(root) == -1)
            return false;
        else
            return true;
    }
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftLevel = maxDepth(root.left);
        int rightLevel = maxDepth(root.right);
        if (leftLevel == -1 || rightLevel == -1)
            return -1;
        if ((leftLevel - rightLevel) < -1 || (leftLevel - rightLevel) > 1 ){
            return -1;
        }
        return leftLevel > rightLevel ? leftLevel+1: rightLevel+1;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
