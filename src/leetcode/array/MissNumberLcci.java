package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName MissNumberLcci
 * @Description 消失的数字
 * @Author changxuan
 * @Date 2020/7/31 下午10:15
 **/
public class MissNumberLcci {

    /**
     * 另一种思路： 既然是连续的数字，可以用不缺数字的总和减去数字的实际总和
     *
     */

    public static void main(String[] args) {
        int[] arrays = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arrays));
    }

    public static int missingNumber(int[] nums) {
        int[] index = new int[nums.length+1];
        Arrays.fill(index, -1);
        for (int i = 0; i < nums.length; i++){
            index[nums[i]] = 0;
        }
        for (int j = 0; j < index.length; j++){
            if (index[j] == -1)
                return j;
        }
        return 0;
    }
}
