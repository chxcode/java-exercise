package leetcode.tree;

/**
 * @ClassName CountCompleteTreeNodes
 * @Description  完全二叉树的节点个数 https://leetcode-cn.com/problems/count-complete-tree-nodes/
 * @Author changxuan
 * @Date 2020/11/24 下午9:30
 **/
public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        System.out.println(1<<8);
    }
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if(left == right){
            return countNodes(root.right) + (1<<left);
        }else{
            return countNodes(root.left) + (1<<right);
        }
    }
    private int countLevel(TreeNode root){
        int level = 0;
        while(root != null){
            level++;
            root = root.left;
        }
        return level;
    }
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
  }


}
