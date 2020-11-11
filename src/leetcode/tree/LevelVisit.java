package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelVisit
 * @Description 从上到下打印二叉树 II
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 * @Author changxuan
 * @Date 2020/11/11 下午8:24
 **/
public class LevelVisit {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new LinkedList<List<Integer>>();
        if (root == null) {
            return levelOrder;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = nodeQueue.poll();
                level.add(treeNode.val);
                if (treeNode.left != null) {
                    nodeQueue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    nodeQueue.add(treeNode.right);
                }
            }
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
