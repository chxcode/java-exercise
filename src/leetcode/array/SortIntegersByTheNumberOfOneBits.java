package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName SortIntegersByTheNumberOfOneBits
 * @Description
 * @Author changxuan
 * @Date 2020/11/6 下午10:12
 **/
public class SortIntegersByTheNumberOfOneBits {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 100000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Integer.bitCount(2));
    }
}
