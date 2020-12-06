package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ChangXuan
 * @Decription: 杨辉三角 https://leetcode-cn.com/problems/pascals-triangle/
 * @Date: 16:05 2020/12/6
 **/
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
