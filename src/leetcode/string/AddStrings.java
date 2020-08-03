package leetcode.string;

/**
 * @ClassName AddStrings
 * @Description 字符串相加
 * @Author changxuan
 * @Date 2020/8/3 下午8:24
 **/
public class AddStrings {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, tag = 0;
        StringBuilder result = new StringBuilder();
        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();
        while (i >=0 || j >=0 || tag > 0){
            int up = i >= 0 ? num1Char[i--] - '0' : 0;
            int down = j >= 0 ? num2Char[j--] - '0' : 0;
            int temp = up + down + tag;
            tag = temp / 10;
            result.append(temp%10);
        }
        return result.reverse().toString();
    }
}
