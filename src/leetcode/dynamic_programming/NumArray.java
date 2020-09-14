package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @ClassName NumArray
 * @Description 区域和检索 - 数组不可变 https://leetcode-cn.com/problems/range-sum-query-immutable/
 * @Author changxuan
 * @Date 2020/8/1 下午9:14
 **/
public class NumArray {

    private int[] dp;

    public NumArray(int[] nums) {
        dp = new int[nums.length+1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++)
            dp[i] = dp[i-1] + nums[i-1];
    }

    public int sumRange(int i, int j) {
        return dp[j+1] - dp[i];
    }

    public static void main(String[] args) {
        int[] test = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(test);
        System.out.println(Arrays.toString(numArray.dp));
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));
    }
}
