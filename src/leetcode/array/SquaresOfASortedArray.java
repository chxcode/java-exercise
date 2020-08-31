package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName SquaresOfASortedArray
 * @Description 有序数组的平方
 * @Author changxuan
 * @Date 2020/8/31 下午9:10
 **/
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
