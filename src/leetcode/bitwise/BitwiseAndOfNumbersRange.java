package leetcode.bitwise;

/**
 * @Author: ChangXuan
 * @Decription: 数字范围按位与 https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 * @Date: 20:52 2020/8/23
 **/
public class BitwiseAndOfNumbersRange {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd3(0,2147483647));
    }
    // 时长超时
    public static int rangeBitwiseAnd(int m, int n) {
        int result = m;
        for (int i = m+1; i <= n; i++){
            result = result & i;
        }
        return result;

    }

    public static int rangeBitwiseAndPro(int m, int n) {
            int shift = 0;
            // 找到公共前缀
            while (m < n) {
                m >>= 1;
                n >>= 1;
                ++shift;
            }
            return m << shift;
    }

    public static int rangeBitwiseAnd3(int m, int n) {
        while (m < n) {
            // 抹去最右边的 1
            n = n & (n - 1);
        }
        return n;
    }

}
