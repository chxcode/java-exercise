package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ChangXuan
 * @Decription: 二叉树的后序遍历 https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * @Date: 16:39 2020/9/29
 **/
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        visit(root, res);
        return res;
    }

    public void visit(TreeNode treeNode, List<Integer> res) {
        if (treeNode == null) return;
        visit(treeNode.left, res);
        visit(treeNode.right, res);
        res.add(treeNode.val);
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
