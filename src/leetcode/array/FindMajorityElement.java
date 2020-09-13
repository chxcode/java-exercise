package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FindMajorityElement
 * @Description 主要元素 https://leetcode-cn.com/problems/find-majority-element-lcci/
 * @Author changxuan
 * @Date 2020/8/2 下午10:30
 **/
public class FindMajorityElement {

    // 考虑使用投票法 两两抵消
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            if (count.containsKey(nums[i]))
                count.put(nums[i], count.get(nums[i])+1);
            else
                count.put(nums[i], 1);
        int len = nums.length / 2  + 1;
        for (Integer item : count.keySet())
            if (count.get(item) > len)
                return item;
        return -1;
    }

    /**
     * 投票法
     * @param nums 数组
     * @return 占多数数字
     */
    public int majorityElementPro(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int box = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (box == nums[i]) {
                count++;
            }else {
                if (count == 0) {
                    box = nums[i];
                    count = 1;
                }else {
                    count--;
                }
            }
        }
        return box;
    }
}
