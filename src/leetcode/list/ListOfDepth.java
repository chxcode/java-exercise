package leetcode.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName ListOfDepth
 * @Description 特定深度节点列表 https://leetcode-cn.com/problems/list-of-depth-lcci/
 * @Author changxuan
 * @Date 2020/10/16 下午10:08
 **/
public class ListOfDepth {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) return new ListNode[0];
        ArrayList<ListNode> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.peek();
            int size = queue.size();
            ListNode listNode = new ListNode(treeNode.val);
            ListNode temp = listNode;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.next = new ListNode(node.val);
                temp = temp.next;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(listNode.next);
        }
        ListNode[] listNodes = new ListNode[res.size()];
        int index = 0;
        for (ListNode item : res) {
            listNodes[index++] = item;
        }
        return listNodes;
    }

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
