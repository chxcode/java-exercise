package leetcode.array;

/**
 * @ClassName BuildProductArray
 * @Description 构建乘积数组 https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/
 * @Author changxuan
 * @Date 2020/10/9 下午8:32
 **/
public class BuildProductArray {
    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[0];
        int[] res = new int[a.length];
        res[0] = 1;
        int temp = 1;
        for (int i = 1; i < a.length; i++) res[i] = a[i - 1] * res[i - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            temp = temp * a[i + 1];
            res[i] = res[i] * temp;
        }
        return res;
    }
}
