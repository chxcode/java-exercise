package leetcode.array;

/**
 * @Author: ChangXuan
 * @Decription: 所有奇数长度子数组的和 https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 * @Date: 16:19 2020/11/8
 **/
public class SumOfAllOddLengthSubArrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length, sum = 0;
        for(int i=0;i<length;i++){  //遍历数组
            int left = i+1, right = length-i;
            int left_odd = left/2, right_odd = right/2;
            int left_even = (left + 1)/2, right_even = (right + 1)/2;
            sum += arr[i]*(left_odd*right_odd + left_even*right_even);
        }
        return sum;
    }
}
