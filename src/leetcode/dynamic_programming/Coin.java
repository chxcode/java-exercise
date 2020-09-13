package leetcode.dynamic_programming;

/**
 * @ClassName CoinLcci
 * @Description 硬币 https://leetcode-cn.com/problems/coin-lcci/
 * @Author changxuan
 * @Date 2020/7/26 下午11:04
 **/
public class Coin {

    public static void main(String[] args) {
        System.out.println(waysToChange(5));
    }

    public static int waysToChange(int n){
        int[] dp = new int[n+1];
        int[] coins = {1,5,10,25};
        dp[0] = 1;
        for (int coin : coins){
            for (int i = coin; i <= n; i++ ){
                dp[i] = (dp[i]+dp[i-coin]) % 1000000007;
            }
        }
        return dp[n];
    }
}
