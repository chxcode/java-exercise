package leetcode.array;

import java.util.*;

/**
 * @ClassName GroupAnagrams
 * @Description 字母异位词分组 https://leetcode-cn.com/problems/group-anagrams/
 * @Author changxuan
 * @Date 2020/12/14 下午9:20
 **/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            map.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
