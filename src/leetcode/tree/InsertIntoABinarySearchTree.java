package leetcode.tree;

/**
 * @Author: ChangXuan
 * @Decription: 二叉搜索树中的插入操作 https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
 * @Date: 23:12 2020/9/30
 **/
public class InsertIntoABinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    // TODO 整理
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //边界条件判断
        if (root == null)
            return new TreeNode(val);
        TreeNode cur = root;
        while (true) {
            //如果当前节点cur的值大于val，说明val值应该插入到
            //当前节点cur的左子树，否则就插入到当前节点cur的右子树
            if (cur.val > val) {
                //如果左子节点不为空，就继续往下找
                if (cur.left != null) {
                    cur = cur.left;
                } else {//如果左子节点为空，就直接插入去，然后再返回root节点
                    cur.left = new TreeNode(val);
                    return root;
                }
            } else {//同上
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = new TreeNode(val);
                    return root;
                }
            }
        }
    }
}
