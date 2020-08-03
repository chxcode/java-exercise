package leetcode.string;

/**
 * @ClassName ReverseWordsInAString
 * @Description 反转字符串中的单词 III
 * @Author changxuan
 * @Date 2020/8/3 下午9:07
 **/
public class ReverseWordsInAString {

    public String reverse(String s){
        String[] sArr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String item : sArr){
            result.append(new StringBuilder(item).reverse().toString()).append(" ");
        }
        result.deleteCharAt(result.lastIndexOf(" "));
        return result.toString();
    }
}
