package leetcode.array;

/**
 * @ClassName RotateArray
 * @Description 旋转数组 https://leetcode-cn.com/problems/rotate-array/
 * @Author changxuan
 * @Date 2021/1/8 下午9:31
 **/
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        // 分解为三个反转
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
