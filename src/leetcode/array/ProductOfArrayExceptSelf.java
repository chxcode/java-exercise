package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName ProductOfArrayExceptSelf
 * @Description 除自身以外数组的乘积 https://leetcode-cn.com/problems/product-of-array-except-self/
 * @Author changxuan
 * @Date 2020/8/7 下午9:13
 **/
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] temp = new int[nums.length];
        Arrays.fill(temp, 1);
        Arrays.fill(result, 1);
        // 求前缀乘积
        for (int i = 1; i < nums.length; i++){
            temp[i] = temp[i-1] * nums[i-1];
        }
        // 求结果
        for (int i = nums.length-2; i >= 0; i-- ){
            result[i] = nums[i+1] * result[i+1];
        }
        for (int i = 0; i < nums.length; i++)
            result[i] = result[i] * temp[i];
        return result;
    }
}
