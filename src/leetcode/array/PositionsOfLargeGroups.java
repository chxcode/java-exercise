package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PositionsOfLargeGroups
 * @Description 较大分组的位置
 * https://leetcode-cn.com/problems/positions-of-large-groups/
 * @Author changxuan
 * @Date 2021/1/5 下午9:40
 **/
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        int sLen = s.length();
        char[] sArr = s.toCharArray();
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 1; i < sLen; i++) {
            List<Integer> range = new ArrayList<>();
            int start = i - 1;
            int end = i - 1;
            while (i < sLen && sArr[i] == sArr[i-1]) {
                end++;
                i++;
            }
            if (end - start > 1) {
                range.add(start);
                range.add(end);
                ret.add(range);
            }
        }
        return ret;

    }
}
