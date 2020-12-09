package leetcode.array;

/**
 * @ClassName ScoreAfterFlippingMatrix
 * @Description 翻转矩阵后的得分
 * https://leetcode-cn.com/problems/score-after-flipping-matrix/
 * @Author changxuan
 * @Date 2020/12/7 下午9:48
 **/
public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int ret = m * (1 << (n - 1));

        for (int j = 1; j < n; j++) {
            int nOnes = 0;
            for (int i = 0; i < m; i++) {
                if (A[i][0] == 1) {
                    nOnes += A[i][j];
                } else {
                    nOnes += (1 - A[i][j]); // 如果这一行进行了行反转，则该元素的实际取值为 1 - A[i][j]
                }
            }
            int k = Math.max(nOnes, m - nOnes);
            ret += k * (1 << (n - j - 1));
        }
        return ret;
    }
}