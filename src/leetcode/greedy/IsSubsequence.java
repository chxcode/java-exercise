package leetcode.greedy;

/**
 * @ClassName IsSubsequence
 * @Description 判断子序列
 * @Author changxuan
 * @Date 2020/8/1 下午9:01
 **/
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int i = 0, j = 0;
        while (i < sl && j < tl){
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return sl == i;
    }
}
