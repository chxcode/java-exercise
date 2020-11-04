package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName SpiralMatrix
 * @Description 螺旋矩阵 2 https://leetcode-cn.com/problems/spiral-matrix-ii/
 * @Author changxuan
 * @Date 2020/11/4 下午7:36
 **/
public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n) {
        if (n == 0) return new int[0][0];
        int[][] res = new int[n][n];
        int t = n * n;
        int count = 1;
        // 定义边界
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (count <= t) {
            for (int i = left; i <= right; i++) {
                res[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res[i][right] = count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                res[bottom][i] = count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                res[i][left] = count++;
            }
            left++;
        }
        return res;
    }
}
