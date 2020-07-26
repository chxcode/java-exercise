package leetcode.dynamic_programming;

/**
 * @ClassName DeleteAndEarn
 * @Description
 * @Author changxuan
 * @Date 2020/7/26 下午9:53
 **/
public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] arr = {3,4,2};
        System.out.println(deleteAndEarn(arr));
    }
    public static int deleteAndEarn(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int max = nums[0];
        for (int i = 0; i < len; ++i) {
            max = Math.max(max, nums[i]);
        }
        // 构造有序数组
        int[] sortArr = new int[max+1];
        for (int i = 0; i < len; i++){
            sortArr[nums[i]]++;
        }

        // 声明dp数组
        int[] dp = new int[max+1];
        dp[1] = sortArr[1];
        for (int i = 2; i <= max; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+sortArr[i]*i);
        }
        return dp[max];
    }
}
