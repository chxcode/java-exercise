package leetcode.bitwise;

/**
 * @ClassName SingleNumber
 * @Description 只出现一次的数字 https://leetcode-cn.com/problems/single-number/
 * @Author changxuan
 * @Date 2020/8/14 下午9:49
 **/
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(4 ^ 1 ^ 2 ^ 1 ^ 2 ^ 4 ^ 0);
        System.out.println(2 ^ 2 ^ 1);
        int[] ints = {4,1,2,1,2};
        System.out.println(singleNumber(ints));
    }
    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }
}
