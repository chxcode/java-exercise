package leetcode.array;

/**
 * @ClassName FindTheDifference
 * @Description 找不同 https://leetcode-cn.com/problems/find-the-difference/
 * @Author changxuan
 * @Date 2020/12/18 下午9:17
 **/
public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
    public static char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.toCharArray()[0];
        int[] count = new int[26];
        char[] sChar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count[sChar[i] - 97]++;
        }
        char[] tChar = t.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            count[tChar[i] - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == -1) return (char)(i+97);
        }
        return 'a';
    }
}
