package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName PlusOne
 * @Description 加一 https://leetcode-cn.com/problems/plus-one/
 * @Author changxuan
 * @Date 2020/11/26 下午8:58
 **/
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1] = digits[digits.length-1] + 1;
        int i = digits.length-1;
        int maxBit = 0;
        while (i >=0 && digits[i] > 9) {
            int temp = digits[i];
            digits[i] = temp % 10;
            if (i == 0) maxBit = temp/10;
            else digits[i-1] += temp/10;
            i--;
        }
        if (maxBit != 0) {
            int[] res = new int[digits.length+1];
            res[0] = maxBit;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        } else{
            return digits;
        }
    }

    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]++;
                digits[i] = digits[i] % 10;
                if (digits[i] != 0) return digits;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }


}
