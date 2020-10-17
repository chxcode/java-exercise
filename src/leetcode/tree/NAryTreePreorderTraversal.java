package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ChangXuan
 * @Decription: n叉树的前序遍历 https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * @Date: 16:07 2020/10/17
 **/
public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preVisit(res, root);
        return res;
    }

    public void preVisit(List<Integer> res, Node root) {
        if (root == null) return;
        res.add(root.val);
        for (Node item : root.children) {
            preVisit(res, item);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
