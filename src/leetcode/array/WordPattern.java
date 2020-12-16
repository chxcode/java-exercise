package leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName WordPattern
 * @Description 单词规律 https://leetcode-cn.com/problems/word-pattern/
 * @Author changxuan
 * @Date 2020/12/16 下午7:59
 **/
public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        char[] patterns = pattern.toCharArray();
        String[] sArr = s.split(" ");
        if (patterns.length != sArr.length) return false;
        Map<Character, String> dict = new HashMap<>();
        Set<String> bucket = new HashSet<>();
        for (int i = 0; i < sArr.length; i++) {
            if (dict.containsKey(patterns[i])) {
                if (dict.get(patterns[i]).equals(sArr[i])) continue;
                else return false;
            } else {
                if (bucket.contains(sArr[i])) return false;
                dict.put(patterns[i], sArr[i]);
                bucket.add(sArr[i]);
            }
        }
        return true;
    }
}
