package leetcode.bitwise;

/**
 * @ClassName PowerOfTwo
 * @Description 2的幂 https://leetcode-cn.com/problems/power-of-two/
 * @Author changxuan
 * @Date 2020/8/9 下午10:00
 **/
public class PowerOfTwo {
    public static void main(String[] args) {
        //System.out.println(1>>1);
        //System.out.println(isPowerOfTwo(7));
        System.out.println(8 & 7);
    }
    public boolean isPowerOfTwos(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return  false;
        if (n == 1) return true;
        while (n != 1){
            if (n%2 != 0)
                return false;
            n = n >>1;
        }
        return true;
    }
}
