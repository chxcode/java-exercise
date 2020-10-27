package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTreePreorderTraversal
 * @Description 二叉树的前序遍历 https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @Author changxuan
 * @Date 2020/10/27 下午7:33
 **/
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preVisit(root, res);
        return res;
    }

    public void preVisit(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preVisit(root.left, res);
        preVisit(root.right, res);
    }

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
         }
    }
}
