package leetcode.array;

import java.util.HashSet;

/**
 * @ClassName ContainsDuplicate
 * @Description 存在重复元素
 * @Author changxuan
 * @Date 2020/8/10 下午8:32
 **/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet(nums.length);
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
