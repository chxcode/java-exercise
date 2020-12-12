package leetcode.greedy;

/**
 * @ClassName WiggleSubsequence
 * @Description 摆动序列 https://leetcode-cn.com/problems/wiggle-subsequence/
 * @Author changxuan
 * @Date 2020/12/12 上午8:08
 **/
public class WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        int down = 1, up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            else if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return nums.length == 0 ? 0 : Math.max(down, up);
    }
}
