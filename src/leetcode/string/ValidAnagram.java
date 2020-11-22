package leetcode.string;

/**
 * @ClassName ValidAnagram
 * @Description 有效的字母异位词 https://leetcode-cn.com/problems/valid-anagram/
 * @Author changxuan
 * @Date 2020/11/22 下午10:52
 **/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] alpha = new int[26];
        for(int i = 0; i< s.length(); i++) {
            alpha[s.charAt(i) - 'a'] ++;
            alpha[t.charAt(i) - 'a'] --;
        }
        for(int i=0;i<26;i++)
            if(alpha[i] != 0)
                return false;
        return true;
    }
}
