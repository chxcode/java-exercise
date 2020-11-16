package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @Author: ChangXuan
 * @Decription: 最长上升子序列 https://leetcode-cn.com/problems/longest-increasing-subsequence/
 * @Date: 16:31 2020/11/15
 **/
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int res = 0;
        Arrays.fill(dp, 1);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
