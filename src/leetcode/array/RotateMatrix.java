package leetcode.array;

/**
 * @ClassName RotateMatrix
 * @Description 旋转矩阵 https://leetcode-cn.com/problems/rotate-matrix-lcci/
 * @Author changxuan
 * @Date 2020/9/11 下午9:08
 **/
public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                // 存储上边
                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];

                matrix[last-offset][first] = matrix[last][last-offset];

                matrix[last][last-offset] = matrix[i][last];

                matrix[i][last] = top;

            }
        }
    }
}
