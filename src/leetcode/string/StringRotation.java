package leetcode.string;

/**
 * @ClassName StringRotation
 * @Description 字符串轮转
 * @Author changxuan
 * @Date 2020/9/5 下午10:49
 **/
public class StringRotation {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        StringBuilder s2Builder =  new StringBuilder(s2 + s2);
        if (s2Builder.indexOf(s1) == -1) return false;
        return true;
    }
}
