package leetcode.dynamic_programming;

/**
 * @ClassName ClimbingStairs
 * @Description 爬楼梯
 * @Author changxuan
 * @Date 2020/7/15 上午12:08
 **/
public class ClimbingStairs {

    public static void main(String[] args) {
        int[] map = new int[5];
        for (int i = 0; i < map.length; i++)
            map[i] = -1;
        System.out.println(countWaysDP(4, map));
        System.out.println(count(4));
    }

    public static int countWaysDP(int n, int[] map) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (map[n] > -1) {
            return map[n];
        } else {
            map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) + countWaysDP(n - 3, map);
            return map[n];
        }
    }

    public static int count(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
