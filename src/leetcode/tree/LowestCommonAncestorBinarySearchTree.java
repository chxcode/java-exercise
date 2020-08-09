package leetcode.tree;

/**
 * @ClassName LowestCommonAncestorBinarySearchTree
 * @Description 二叉树的最近公共祖先
 * @Author changxuan
 * @Date 2020/8/9 下午9:29
 **/
public class LowestCommonAncestorBinarySearchTree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 判断叶子结点
        if ( root == null ){
            return null;
        }
        // 判断当前节点是否在两节点之间 如果在就是当前节点
        if (between(p.val, q.val, root.val))
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null)
            return right;
        if (right == null)
            return left;
        return root;
    }

    public static boolean between(int start, int end, int mid){
        if (start > end){
            int temp = start;
            start = end;
            end = temp;
        }
        if (start <= mid && mid <= end)
            return true;
        else
            return false;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
