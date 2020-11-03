package leetcode.array;

/**
 * @ClassName ValidMountainArray
 * @Description 有效的山脉数组 https://leetcode-cn.com/problems/valid-mountain-array/
 * @Author changxuan
 * @Date 2020/11/3 下午7:47
 **/
public class ValidMountainArray {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2, 0, 2}));
    }

    public static boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int i = 0, j = A.length - 1;
        while (i + 1 < A.length && A[i] < A[i + 1])
            i++;
        while (j > 0 && A[j - 1] > A[j])
            j--;
        return i > 0 && j < A.length - 1 && i == j;
    }
}
