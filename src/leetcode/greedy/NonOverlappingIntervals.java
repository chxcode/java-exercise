package leetcode.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName NonOverlappingIntervals
 * @Description 无重叠区间 https://leetcode-cn.com/problems/non-overlapping-intervals/
 * @Author changxuan
 * @Date 2020/12/31 下午9:42
 **/
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        // 按 end 升序排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        // 至少有一个区间不相交
        int count = 1;
        // 排序后，第一个区间就是 x
        int x_end = intervals[0][1];
        for (int[] interval : intervals) {
            int start = interval[0];
            if (start >= x_end) {
                // 找到下一个选择的区间了
                count++;
                x_end = interval[1];
            }
        }
        return intervals.length-count;
    }

}
