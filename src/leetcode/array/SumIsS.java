package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName SumIsS
 * @Description 和是S的两个数字 https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * @Author changxuan
 * @Date 2020/9/3 下午9:49
 **/
public class SumIsS {
    public static void main(String[] args) {
        int[] test = {16,16,18,24,30,32};
        System.out.println(Arrays.toString(twoSum(test, 48)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            result[0] = nums[i];
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return null;
    }
    public int[] twoSumPro(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int s = nums[i] + nums[j];
            if(s < target) i++;
            else if(s > target) j--;
            else return new int[] { nums[i], nums[j] };
        }
        return new int[0];
    }

}
