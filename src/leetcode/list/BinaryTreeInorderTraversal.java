package leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTreeInorderTraversal
 * @Description 二叉树中序遍历 https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * @Author changxuan
 * @Date 2020/9/14 下午8:53
 **/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> elements = new ArrayList<>();
        inorder(root, elements);
        return elements;
    }

    public void inorder(TreeNode root, List<Integer> elements) {
        if (root == null) return;
        inorder(root.left, elements);
        elements.add(root.val);
        inorder(root.right, elements);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
