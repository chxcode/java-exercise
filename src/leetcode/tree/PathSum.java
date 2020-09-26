package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PathSum
 * @Description 路经总和2 https://leetcode-cn.com/problems/path-sum-ii/
 * @Author changxuan
 * @Date 2020/9/26 下午7:25
 **/
public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, sum, 0, new ArrayList<>(), result);
        return result;
    }

    public void dfs(TreeNode root, int sum, int total, List<Integer> list, List<List<Integer>> result) {
        //如果节点为空直接返回
        if (root == null)
            return;
        //把当前节点值加入到list中
        list.add(new Integer(root.val));
        //走一步就要计算走过的路径和
        total += root.val;
        //如果到达叶子节点，就不能往下走了，直接return
        if (root.left == null && root.right == null) {
            //如果到达叶子节点，并且sum等于total，说明我们找到了一组，
            //要把它放到result中
            if (sum == total) result.add(new ArrayList(list));
            //注意别忘了把最后加入的结点值给移除掉，因为下一步直接return了，
            list.remove(list.size() - 1);
            return;
        }
        dfs(root.left, sum, total, list, result);
        dfs(root.right, sum, total, list, result);
        //我们把这个值使用完之后还要把它给移除，这就是回溯
        list.remove(list.size() - 1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
