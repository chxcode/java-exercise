package leetcode.tree;

import java.util.ArrayList;

/**
 * @ClassName KthMallestElementInABst
 * @Description 二叉搜索树中第K小的元素
 * @Author changxuan
 * @Date 2020/8/10 下午8:15
 **/
public class KthSmallestElementInABst {
    // 中序遍历输出的是升序数字
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        midSearch(root, treeNodes);
        return treeNodes.get(k-1).val;
    }

    public void midSearch(TreeNode root, ArrayList<TreeNode> nodes){
        if (root == null)
            return;
        midSearch(root.left, nodes);
        nodes.add(root);
        midSearch(root.right, nodes);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
