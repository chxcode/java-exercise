package leetcode.string;

/**
 * @ClassName CompressString
 * @Description 字符串压缩 https://leetcode-cn.com/problems/compress-string-lcci/
 * @Author changxuan
 * @Date 2020/9/12 下午9:08
 **/
public class CompressString {
    public String compressString(String S) {
        if (S == null) return null;
        if (S.length() == 0) return "";
        char[] SArr = S.toCharArray();
        StringBuilder res = new StringBuilder();
        res.append(SArr[0]);
        int count = 1;
        for (int i = 1; i < SArr.length; ++i) {
            if (SArr[i] == SArr[i - 1]){
                count++;
            }else {
                res.append(count).append(SArr[i]);
                count = 1;
            }
        }
        res.append(count);
        return S.length() > res.length() ? res.toString() : S;
    }
}
