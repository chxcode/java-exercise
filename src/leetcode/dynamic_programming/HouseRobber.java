package leetcode.dynamic_programming;

/**
 * @ClassName HouseRobber
 * @Description 打家劫舍 https://leetcode-cn.com/problems/house-robber/
 * @Author changxuan
 * @Date 2020/7/26 下午9:14
 **/
public class HouseRobber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int length = nums.length;
        int[] dp = new int[length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i-1]);
        }
        return dp[length];
    }
}
