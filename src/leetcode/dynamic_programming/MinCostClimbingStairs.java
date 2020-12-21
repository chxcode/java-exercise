package leetcode.dynamic_programming;

/**
 * @ClassName MinCostClimbingStairs
 * @Description 使用最小花费爬楼梯 https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 * @Author changxuan
 * @Date 2020/12/21 下午8:11
 **/
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2;i <= cost.length; i++) {
            dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }
        return  dp[cost.length];
    }
}
