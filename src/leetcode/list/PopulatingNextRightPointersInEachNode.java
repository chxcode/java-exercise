package leetcode.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName PopulatingNextRightPointersInEachNode
 * @Description 填充每个节点的下一个右侧节点指针 https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 * @Author changxuan
 * @Date 2020/10/15 下午11:18
 **/
public class PopulatingNextRightPointersInEachNode {
    // 层次遍历
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i < size - 1) node.next = queue.peek();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return root;
    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
