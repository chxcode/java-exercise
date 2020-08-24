package leetcode.string;

/**
 * @ClassName RepeatedSubstringPattern
 * @Description 重复的子字符串
 * @Author changxuan
 * @Date 2020/8/24 下午8:27
 **/
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
}
