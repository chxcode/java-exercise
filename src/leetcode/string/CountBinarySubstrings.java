package leetcode.string;

/**
 * @ClassName CountBinarySubstrings
 * @Description 计数二进制子串
 * @Author changxuan
 * @Date 2020/8/10 下午8:44
 **/
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int[] counts = new int[s.length()];
        char[] sChars = s.toCharArray();
        int j = 0, result = 0; counts[j] = 1;
        for (int i = 1; i < s.length(); i++){
            if (sChars[i] == sChars[i-1]) counts[j]++;
            else counts[++j]++;
        }
        for (int i = 1; i < counts.length; i++ ){
            if (counts[i] == 0) break;
            result = result + Math.min(counts[i-1], counts[i]);
        }
        return result;
    }
}
