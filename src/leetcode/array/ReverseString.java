package leetcode.array;

/**
 * @ClassName ReverseString
 * @Description 反转数组
 * @Author changxuan
 * @Date 2020/8/6 下午9:09
 **/
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        //reverseString(s);
        test(s);
    }

    public static void reverseString(char[] s) {
        char temp;
        int i = 0, j = s.length == 0 ? 0 : s.length -1;
        while (i < j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        // 不用输出
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int l = 0; l < s.length; l++){
            if (l == s.length-1)
                stringBuilder.append("\""+s[l]+"\"]");
            else
                stringBuilder.append("\""+s[l]+"\",");
        }
        System.out.println(stringBuilder.toString());
    }

    public static void test(char[] s){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = s.length-1; i >=0; i--){
            if (i == 0)
                stringBuilder.append("\""+s[i]+"\"]");
            else
                stringBuilder.append("\""+s[i]+"\",");
        }
        System.out.println(stringBuilder.toString());
    }
    public static void test1(char[] s){

    }
}
