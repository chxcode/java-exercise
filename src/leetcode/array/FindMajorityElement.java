package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FindMajorityElement
 * @Description 主要元素
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
}
