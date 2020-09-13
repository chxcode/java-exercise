package leetcode.dynamic_programming;

import java.util.Arrays;

/**
 * @ClassName UniquePath
 * @Description A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * @Author changxuan
 * @Date 2020/6/29 下午8:25
 **/
public class UniquePath {
    public static void main(String[] args) {
        System.out.println(uniquePaths(100,100));
    }

    public static int uniquePaths(int m, int n) {
        int[] temp = new int[m];
        Arrays.fill(temp,1);
        for (int j = 0; j < n-1; j++){
            for (int c = 1; c < m; c++){
                temp[c] = temp[c-1] + temp[c];
            }
        }
        return temp[m-1];
    }
}
