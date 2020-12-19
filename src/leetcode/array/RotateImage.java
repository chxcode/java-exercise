package leetcode.array;

/**
 * @ClassName RotateImage
 * @Description 旋转图像
 * https://leetcode-cn.com/problems/rotate-image/
 * @Author changxuan
 * @Date 2020/12/19 下午8:50
 **/
public class RotateImage {
    public void rotate(int[][] matrix) {
        // 上下交换
        swapOfUpAndDown(matrix);
        // 对角线交换
        swapOfOppositeAngles(matrix);
    }

    public void swapOfUpAndDown(int[][] matrix) {
        int rHead = 0;
        int rTail = matrix.length-1;
        while (rHead < rTail) {
            for (int i = 0; i < matrix[0].length; ++i) {
                int temp = matrix[rHead][i];
                matrix[rHead][i] = matrix[rTail][i];
                matrix[rTail][i] = temp;
            }
            rHead++; rTail--;
        }
    }

    public void swapOfOppositeAngles(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = i+1; j < matrix[0].length; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
