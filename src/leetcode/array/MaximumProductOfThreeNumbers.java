package leetcode.array;

import java.util.Arrays;

/**
 * @Author: ChangXuan
 * @Decription: 三个数的最大乘积 https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 * @Date: 21:48 2020/10/4
 **/
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
