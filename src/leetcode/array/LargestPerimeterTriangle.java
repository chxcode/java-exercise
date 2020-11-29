package leetcode.array;

import java.util.Arrays;

/**
 * @Author: ChangXuan
 * @Decription: 三角形的最大周长 https://leetcode-cn.com/problems/largest-perimeter-triangle/
 * @Date: 15:54 2020/11/29
 **/
public class LargestPerimeterTriangle {

    // 暴力超时
    public int largestPerimeter(int[] A) {
        int res = 0;
        for (int x = 0; x < A.length; x++) {
            for (int y = x+1; y < A.length; y++) {
                for (int z = y+1; z < A.length; z++) {
                    if (judgeTriangle(A[x], A[y], A[z])) {
                        int length = A[x] + A[y] + A[z];
                        res = Math.max(length, res);
                    }
                }
            }
        }
        return res;
    }

    public boolean judgeTriangle(int x, int y, int z) {
        if (x + y > z && x + z > y && y + z > x) {
            return true;
        } else {
            return false;
        }
    }

    // 排序后 从后面直接拿到符合条件且最大的数据
    public int largestPerimeterPro(int[] A) {
        Arrays.sort(A);
        for(int i = A.length-1; i >= 2; --i){
            if(A[i] < A[i-1] + A[i-2])
                return A[i]+A[i-1]+A[i-2];
        }
        return 0;
    }
}
