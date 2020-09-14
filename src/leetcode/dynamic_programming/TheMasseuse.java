package leetcode.dynamic_programming;

/**
 * @ClassName TheMasseuse
 * @Description 按摩师 https://leetcode-cn.com/submissions/detail/93447387/
 * @Author changxuan
 * @Date 2020/7/31 下午10:29
 **/
public class TheMasseuse {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,1};
        System.out.println(massage(arrays));

        int[] arraysTwo = {2,7,9,3,1};
        System.out.println(massage(arraysTwo));

        int[] arraysThree = {2,1,4,5,3,1,1,3};
        System.out.println(massage(arraysThree));
    }
    public static int massage(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length+1];
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }
        return dp[nums.length];
    }
}
