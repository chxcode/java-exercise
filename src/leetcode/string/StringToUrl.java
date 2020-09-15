package leetcode.string;

/**
 * @ClassName StringToUrl
 * @Description URL化 https://leetcode-cn.com/problems/string-to-url-lcci/
 * @Author changxuan
 * @Date 2020/9/15 下午8:50
 **/
public class StringToUrl {

    public String replaceSpaces(String S, int length) {
        return S.substring(0, length).replaceAll(" ", "%20");
    }
}
