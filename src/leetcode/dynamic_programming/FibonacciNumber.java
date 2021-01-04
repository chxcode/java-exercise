package leetcode.dynamic_programming;

/**
 * @ClassName FibonacciNumber
 * @Description 斐波那契数列 https://leetcode-cn.com/problems/fibonacci-number/
 * @Author changxuan
 * @Date 2021/1/4 下午9:14
 **/
public class FibonacciNumber {
    public int fib(int n) {
        int[] dp = new int[n+3];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; ++i) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
