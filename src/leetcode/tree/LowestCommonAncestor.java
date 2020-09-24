package leetcode.tree;

import java.util.Stack;

/**
 * @ClassName LowestCommonAncestor
 * @Description 最近公共祖先 https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 * 待整理
 * @Author changxuan
 * @Date 2020/8/8 下午8:07
 **/
public class LowestCommonAncestor {

    //优秀解法
    public TreeNode test(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        generatePath(root, pStack, p);
        generatePath(root, qStack, q);
        int pSize = pStack.size();
        int qSize = qStack.size();
        if (qSize < pSize)
            while (pSize != qSize) {
                pStack.pop();
                pSize--;
            }
        if (qSize > pSize)
            while (pSize != qSize) {
                qStack.pop();
                qSize--;
            }
        while (!qStack.isEmpty() && !pStack.isEmpty()){
            TreeNode qTemp = qStack.pop();
            TreeNode pTemp = pStack.pop();
            if (qTemp.val == pTemp.val)
                return qTemp;
        }
        return null;
    }
    public void generatePath(TreeNode root, Stack<TreeNode> nodeStock, TreeNode node){
        if (root == null)
            return;
        nodeStock.add(root);
        if (root.val == node.val)
            return;
        generatePath(root.left, nodeStock, node);
        if (nodeStock.peek().val == node.val)
            return;
        generatePath(root.right, nodeStock, node);
        if (nodeStock.peek().val == node.val)
            return;
        nodeStock.pop();
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
