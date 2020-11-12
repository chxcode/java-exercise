package leetcode.array;

/**
 * @ClassName SortArrayByParity
 * @Description 按奇偶排序数组 II https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 * @Author changxuan
 * @Date 2020/11/12 下午7:46
 **/
public class SortArrayByParity {
    public int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int[] ji = new int[length / 2];
        int[] ou = new int[length / 2];
        int o = 0, j = 0;
        for (int i = 0; i < length; ++i) {
            if (A[i] % 2 == 0)
                ou[o++] = A[i];
            else
                ji[j++] = A[i];
        }
        for (int i = 0; i < length; ++i) {
            if (i % 2 == 0)
                A[i] = ou[--o];
            else
                A[i] = ji[--j];
        }
        return A;
    }
}
