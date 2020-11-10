package leetcode.recursive;

/**
 * @ClassName HappyString
 * @Description 长度为 n 的开心字符串中字典序第 k 小的字符串 https://leetcode-cn.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
 * @Author changxuan
 * @Date 2020/11/10 下午10:22
 **/
public class HappyString {
    //TODO
    public String getHappyString (int n, int k) {
        if (total(n) < k) return "";
        char[] result = new char[n];
        int idx = 0;
        while(idx < n) {
            char pre = idx == 0? '0' : result[idx-1];
            result[idx] = pre == 'a' ? 'b' : 'a';
            int len = 1 << (n - idx - 1);
            while(k > len) {
                result[idx] = (char)(result[idx]+1);
                if (result[idx] == pre) {
                    result[idx] = (char)(result[idx]+1);
                }
                k-=len;
            }
            ++idx;
        }
        return new String(result);
    }
    int total(int n) {
        return 3 * (1 << (n-1));
    }

}
