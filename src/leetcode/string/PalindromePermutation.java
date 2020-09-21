package leetcode.string;

/**
 * @ClassName PalindromePermutation
 * @Description 回文排列 https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 * @Author changxuan
 * @Date 2020/9/21 下午7:59
 **/
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        if (s == null) return false;
        int length = s.length();
        if (length == 0) return true;
        int[] judge = new int[128];
        for (int i = 0; i < length; i++) {
            if (judge[s.charAt(i)] == 0)
                judge[s.charAt(i)]++;
            else
                judge[s.charAt(i)]--;
        }
        int temp = 0;
        for (int i = 0; i < 128; i++) {
            if (temp == 2) return false;
            if (judge[i] == 0 || judge[i] == 2) continue;
            if (judge[i] == 1) temp++;
        }
        return true;
    }
}
