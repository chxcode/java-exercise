package leetcode.tree;

/**
 * @ClassName maximumDepthOfBinaryTree
 * @Description 二叉树的最大深度
 * @Author changxuan
 * @Date 2020/7/28 下午9:13
 **/
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode nodeRoot = new TreeNode(3);
        TreeNode nodeNine = new TreeNode(9);
        TreeNode nodeTwenty = new TreeNode(20);
        TreeNode nodeFifteen = new TreeNode(15);
        TreeNode nodeSeven = new TreeNode(7);

        //nodeRoot.left = nodeNine;
        nodeRoot.right = nodeTwenty;
        nodeTwenty.left = nodeFifteen;
        nodeTwenty.right = nodeSeven;
        nodeFifteen.right = nodeNine;
        System.out.println(maxDepth(nodeRoot));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftLevel = maxDepth(root.left);
        int rightLevel = maxDepth(root.right);
        return leftLevel > rightLevel ? leftLevel+1: rightLevel+1;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
