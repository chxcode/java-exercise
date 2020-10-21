package leetcode.string;

/**
 * @ClassName LongPressedNames
 * @Description 长按键入 https://leetcode-cn.com/problems/long-pressed-name/
 * @Author changxuan
 * @Date 2020/10/21 下午7:29
 **/
public class LongPressedNames {
    public static void main(String[] args) {
//        System.out.println(isLongPressedName("dfuyalc", "fuuyallc"));
//        System.out.println(isLongPressedName("alex", "alexrr"));
        System.out.println(isLongPressedName("alex", "aaleex"));
    }
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
