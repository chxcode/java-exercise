package leetcode.greedy;

/**
 * @ClassName MonotoneIncreasingDigits
 * @Description 单调递增的数字
 * https://leetcode-cn.com/problems/monotone-increasing-digits/
 * @Author changxuan
 * @Date 2020/12/15 下午8:55
 **/
public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        for (int i = N, j = 9, k = 1; i > 0; i /= 10, k *= 10)
            if (j < (j = i % 10))
                return monotoneIncreasingDigits(i * k - 1);
        return N;
    }
}
