package leetcode.string;

import java.util.HashMap;

/**
 * @ClassName IsomorphicStrings
 * @Description 同构字符串 https://leetcode-cn.com/problems/isomorphic-strings/
 * @Author changxuan
 * @Date 2020/12/27 下午9:08
 **/
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        // 构造字典 s -> t 的映射
        HashMap<Character, Character> dict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!dict.containsKey(s.charAt(i))) {
                if (dict.containsValue(t.charAt(i))) return false;
                dict.put(s.charAt(i), t.charAt(i));
            } else {
                if (dict.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }
        return  true;
    }
}
