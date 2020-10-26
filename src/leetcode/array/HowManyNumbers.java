package leetcode.array;

/**
 * @ClassName HowManyNumbers
 * @Description 有多少小于当前数字的数字 https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * @Author changxuan
 * @Date 2020/10/26 下午9:21
 **/
public class HowManyNumbers {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i-1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] == 0 ? 0 : (count[nums[i] - 1]);
        }
        return res;
    }
}
