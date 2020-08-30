package leetcode.recursive;

/**
 * @ClassName ComputeOneToN
 * @Description 求1+2+…+n
 * @Author changxuan
 * @Date 2020/8/30 下午10:52
 **/
public class ComputeOneToN {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
