package leetcode.string;

import java.util.Arrays;

/**
 * @ClassName IncreasingDecreasingString
 * @Description 上升下降字符串 https://leetcode-cn.com/problems/increasing-decreasing-string/
 * @Author changxuan
 * @Date 2020/11/25 下午8:13
 **/
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        char[] chars = {'a','c','a'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println('a' > 96);
    }

    public String sortString(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer ret = new StringBuffer();
        while (ret.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (num[i] > 0) {
                    ret.append((char) (i + 'a'));
                    num[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (num[i] > 0) {
                    ret.append((char) (i + 'a'));
                    num[i]--;
                }
            }
        }
        return ret.toString();
    }
}
