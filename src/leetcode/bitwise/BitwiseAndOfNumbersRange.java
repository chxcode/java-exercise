package leetcode.bitwise;

/**
 * @Author: ChangXuan
 * @Decription:
 * @Date: 20:52 2020/8/23
 **/
public class BitwiseAndOfNumbersRange {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(0,1));
    }
    // 时长超时
    public static int rangeBitwiseAnd(int m, int n) {
        int result = m;
        for (int i = m+1; i <= n; i++){
            result = result & i;
        }
        return result;

    }

    public int rangeBitwiseAndPro(int m, int n) {
        int shift = 0;
        // 找到公共前缀
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }

}
