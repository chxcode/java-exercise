package leetcode.array;

/**
 * @ClassName MoveZeroes
 * @Description 移动零 https://leetcode-cn.com/problems/move-zeroes/
 * @Author changxuan
 * @Date 2020/11/19 下午10:05
 **/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
