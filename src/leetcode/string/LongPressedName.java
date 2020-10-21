package leetcode.string;

/**
 * @Author: ChangXuan
 * @Decription: 长按键入 https://leetcode-cn.com/problems/long-pressed-name/
 * @Date: 17:42 2020/10/21
 **/
public class LongPressedName {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("laiden", "laiden"));
        System.out.println(isLongPressedName("pyplrz", "ppyypllr"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name == null || typed == null) return false;
        if (name.length() > typed.length()) return false;
        if (name.equals(typed)) return true;
        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();
        int i = 0, j = 0;
        while (i < name.length()) {
            if (j == typedArr.length) return false;
            if (nameArr[i] == typedArr[j]) {
                i++;
                j++;
            }else if (typedArr[j] == nameArr[i-1]) {
                j++;
            }else {
                return false;
            }
        }
        return true;
    }
}
