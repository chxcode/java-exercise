package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @ClassName CoinChange
 * @Description  零钱兑换
 * @Author changxuan
 * @Date 2020/7/29 下午8:50
 **/
public class CoinChange {
    public static int changeCoin(int[] coins, int amount){
        int max = amount+1;
        // 记录account = i 时，最少硬币数
        int[] dp = new int[amount+1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            for (int j = 0; j < coins.length; j++)
                if (i >= coins[j])
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
