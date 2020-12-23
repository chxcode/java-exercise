package leetcode.string;

/**
 * @ClassName FirstUniqueCharacter
 * @Description 字符串中的第一个唯一字符
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @Author changxuan
 * @Date 2020/12/23 下午7:47
 **/
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int res  = -1;
        int[] hash = new int[26];
        char[] sArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            hash[sArr[i]-97]++;
        }
        for (int i = 0;i < s.length(); i++) {
            if (hash[sArr[i]-97] == 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}
