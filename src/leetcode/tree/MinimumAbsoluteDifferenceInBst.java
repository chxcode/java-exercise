package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MinimumAbsoluteDifferenceInBst
 * @Description 二叉搜索树的最小绝对值差 https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * @Author changxuan
 * @Date 2020/10/12 下午8:45
 **/
public class MinimumAbsoluteDifferenceInBst {
    /**
     * 一旦看到 二叉搜索树 要想到 中序遍历能够产生有序数组
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        List<Integer> nodes = new ArrayList<>();
        visitTree(nodes, root);
        for (int i = 1; i < nodes.size(); ++i) {
            res = Math.min(res, nodes.get(i) - nodes.get(i-1));
        }
        return res;
    }
    public void visitTree(List<Integer> nodes, TreeNode root) {
        if (root == null) return;
        visitTree(nodes, root.left);
        nodes.add(root.val);
        visitTree(nodes, root.right);
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
