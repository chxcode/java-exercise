package leetcode.recall;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subsets
 * @Description 子集 https://leetcode-cn.com/problems/subsets/
 * @Author changxuan
 * @Date 2020/9/20 下午7:49
 **/
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
