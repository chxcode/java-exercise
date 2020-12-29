package leetcode.greedy;

/**
 * @ClassName PatchingArray
 * @Description 按要求补齐数组 https://leetcode-cn.com/problems/patching-array/
 * @Author changxuan
 * @Date 2020/12/29 下午8:49
 **/
public class PatchingArray {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length, index = 0;
        while (x <= n) {
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                x *= 2;
                patches++;
            }
        }
        return patches;
    }
}
