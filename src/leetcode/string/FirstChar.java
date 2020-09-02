package leetcode.string;

/**
 * @ClassName FirstChar
 * @Description 第一个只出现一次的字符
 * @Author changxuan
 * @Date 2020/9/2 下午10:58
 **/
public class FirstChar {
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            //首次出现的位置是当前位置，且后面没有再出现这个字符
            if(s.indexOf(ch)==i&&s.indexOf(ch,i+1)==-1)
                return s.charAt(i);
        }
        return ' ';
    }
}
