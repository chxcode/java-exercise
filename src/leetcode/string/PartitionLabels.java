package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PartitionLabels
 * @Description 划分字母区间 https://leetcode-cn.com/problems/partition-labels/
 * @Author changxuan
 * @Date 2020/10/22 下午8:48
 **/
public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i-'a')] = i;
        }
        List<Integer> res = new ArrayList<>();
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, last[S.charAt(i-'a')]);
            if (end == i) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}
