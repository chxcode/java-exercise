package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SummaryRanges
 * @Description 汇总区间 https://leetcode-cn.com/problems/summary-ranges/
 * @Author changxuan
 * @Date 2021/1/10 下午6:54
 **/
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i-1] + 1 == nums[i]) {
                i++;
            }
            int high = i - 1;
            StringBuilder item = new StringBuilder();
            item.append(nums[low]);
            if (low < high) {
                item.append("->");
                item.append(Integer.toString(nums[high]));
            }
            ret.add(item.toString());
        }
        return ret;

    }
}
