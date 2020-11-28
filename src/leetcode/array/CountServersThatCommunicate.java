package leetcode.array;

/**
 * @Author: ChangXuan
 * @Decription: 统计参与通信的服务器 https://leetcode-cn.com/problems/count-servers-that-communicate/
 * @Date: 16:48 2020/11/28
 **/
public class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        int[] m = new int[grid.length];
        int[] n = new int[grid[0].length];
        // 首先记录哪行哪列存在服务器
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    ++m[i];
                    ++n[j];
                }
            }
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && (m[i] > 1 || n[j] > 1))
                    ++ res;
            }
        }
        return res;
    }

}
