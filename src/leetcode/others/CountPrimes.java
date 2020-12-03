package leetcode.others;

import java.util.Arrays;

/**
 * @ClassName CountPrimes
 * @Description 计算质数 https://leetcode-cn.com/problems/count-primes/
 * @Author changxuan
 * @Date 2020/12/3 下午8:52
 **/
public class CountPrimes {
    public int countPrimes(int n) {
        int[] isPrimes = new int[n];
        Arrays.fill(isPrimes, 1);
        int res = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrimes[i] == 1) {
                res++;
                if ((long) i * i < n)
                    for (int j = i*i; j < n; j+=i) {
                        isPrimes[j] = 0;
                    }
            }
        }
        return res;
    }
}
