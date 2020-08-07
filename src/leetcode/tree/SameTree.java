package leetcode.tree;

/**
 * @ClassName SameTree
 * @Description 相同树
 * @Author changxuan
 * @Date 2020/8/7 下午9:42
 **/
public class SameTree {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null)
            return p == q;
        if (q == null)
            return q == p;
        if (p.val != q.val)
            return false;
        boolean left = isSameTree(p.left, q.left);
        if (!left)
            return false;
        boolean right = isSameTree(p.right, q.right);
        if (!right)
            return false;
        return true;
    }

    public static boolean test(){
        System.out.println("pre");
        preSearch();
        System.out.println("head");
        return false;
    }

    public static boolean preSearch(){
        System.out.println("method");
        return true;
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
