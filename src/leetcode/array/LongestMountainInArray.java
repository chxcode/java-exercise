package leetcode.array;

/**
 * @Author: ChangXuan
 * @Decription: 数组中的最长山脉  https://leetcode-cn.com/problems/longest-mountain-in-array/
 * @Date: 15:26 2020/10/25
 **/
public class LongestMountainInArray {
    public int longestMountain(int[] A) {
        int len = A.length;
        if (len == 0) return 0;
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 1; i < len; i++) {
            left[i] = A[i - 1] < A[i] ? left[i-1] + 1 : 0;
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = A[i] > A[i+1] ? right[i+1] + 1 : 0;
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (left[i] > 0 && right[i] >0)
                res = Math.max(res, left[i] + right[i] + 1);
        }
        return res;
    }
}
