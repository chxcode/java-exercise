package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FlattenBinaryTreeToLinkedList
 * @Description 二叉树展开为链表
 * @Author changxuan
 * @Date 2020/8/2 下午10:17
 **/
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        preVisit(root, nodes);

        for (int i = 1; i < nodes.size(); i++){
            TreeNode preNode = nodes.get(i-1), curNode = nodes.get(i);
            preNode.left = null;
            preNode.right = curNode;
        }

    }

    public void preVisit(TreeNode node, List<TreeNode> nodes){
        if (node == null){
            return;
        }
        nodes.add(node);
        preVisit(node.left, nodes);
        preVisit(node.right, nodes);
    }

    class TreeNode {
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
