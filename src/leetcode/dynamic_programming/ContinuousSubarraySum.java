package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @ClassName ContinuousSubarraySum
 * @Description 连续的子数组和 https://leetcode-cn.com/problems/continuous-subarray-sum/
 * @Author changxuan
 * @Date 2020/7/27 下午11:54
 **/
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        System.out.println(checkSubarraySum(arr, 3));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        if (len == 0)
            return false;
        int[] preSum = new int[len+1];
        for (int i = 1; i < len+1; i++){
            preSum[i] = preSum[i-1] + nums[i-1];
        }
        System.out.println(Arrays.toString(preSum));
        for (int i = len; i > 1; i--){
            for (int j = 0; j < i-1; j++){
                if ((k != 0 && (preSum[i] - preSum[j]) % k == 0) ||
                (k == 0 && preSum[i] - preSum[j] == 0)){
                    return true;
                }
            }
        }
        return false;
    }
}
