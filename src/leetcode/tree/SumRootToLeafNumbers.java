package leetcode.tree;

/**
 * @ClassName SumRootToLeafNumbers
 * @Description 求根到叶子节点数字之和 https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 * @Author changxuan
 * @Date 2020/10/29 下午9:08
 **/
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return solution(root, 0);
    }
    public int solution(TreeNode root, int i) {
        if (root == null) return 0;
        int temp = i * 10 + root.val;
        if (root.left == null && root.right == null) return temp;
        return solution(root.left, temp) + solution(root.right, temp);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
