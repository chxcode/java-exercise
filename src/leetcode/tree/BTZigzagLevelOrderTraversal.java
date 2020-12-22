package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName BTZigzagLevelOrderTraversal
 * @Description 二叉树的锯齿形层序遍历
 * https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 * @Author changxuan
 * @Date 2020/12/22 下午6:58
 **/
public class BTZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
        if (root == null) return levelOrder;
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.offer(root);
        int judge = 1;
        while (!treeNodes.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodes.poll();
                if (judge % 2 == 0) {
                    level.add(0, node.val);
                }else {
                    level.add(node.val);
                }
                TreeNode left = node.left;
                TreeNode right = node.right;
                if (left != null){
                    treeNodes.offer(left);
                }
                if (right != null){
                    treeNodes.offer(right);
                }
            }
            judge++;
            levelOrder.add(level);
        }

        return levelOrder;
    }

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
}
