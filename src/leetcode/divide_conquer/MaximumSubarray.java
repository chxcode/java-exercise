package leetcode.divide_conquer;

/**
 * @Author: ChangXuan
 * @Decription: Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * @Date: 17:39 2020/6/26
 **/
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] test = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(test));
    }


    /**
     * 普通方法
     * @param nums 数据
     * @return 最大值
     */
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
            currentSum = Math.max(currentSum, 0);
        }
        return maxSum;
    }
}
