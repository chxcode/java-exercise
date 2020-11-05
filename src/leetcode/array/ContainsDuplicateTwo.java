package leetcode.array;

import java.util.HashSet;

/**
 * @ClassName ContainsDuplicateTwo
 * @Description 存在重复元素2 https://leetcode-cn.com/problems/contains-duplicate-ii/
 * @Author changxuan
 * @Date 2020/11/5 下午10:12
 **/
public class ContainsDuplicateTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> con = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (con.contains(nums[i])) {
                return true;
            }
            con.add(nums[i]);
            if (con.size() > k) {
                con.remove(nums[i-k]);
            }
        }
        return false;
    }
}
