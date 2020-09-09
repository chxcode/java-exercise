package leetcode.array;

/**
 * @ClassName TransposeMatrix
 * @Description 矩阵转置 https://leetcode-cn.com/problems/transpose-matrix/
 * @Author changxuan
 * @Date 2020/9/9 下午8:47
 **/
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }
}
