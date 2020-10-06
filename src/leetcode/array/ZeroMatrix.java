package leetcode.array;

/**
 * @ClassName ZeroMatrix
 * @Description 零矩阵 https://leetcode-cn.com/problems/zero-matrix-lcci/
 * @Author changxuan
 * @Date 2020/9/10 下午8:23
 **/
public class ZeroMatrix {
    /**
     * 零矩阵
     * @param matrix 矩阵
     */
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int  i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (row[i] || column[j]) matrix[i][j] = 0;
    }
}
