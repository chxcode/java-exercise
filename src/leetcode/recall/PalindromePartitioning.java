package leetcode.recall;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PalindromePartitioning
 * @Description 分割回文串 https://leetcode-cn.com/problems/palindrome-partitioning/
 * @Author changxuan
 * @Date 2020/9/25 下午8:54
 **/
public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println((partition("aab")));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtracking(s, 0, res, path);
        return res;
    }

    public static void backtracking(String s, int startIndex, List<List<String>> res, List<String> path) {
        if (startIndex >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); ++i) {
            if (isPartition(s.toCharArray(), startIndex, i)) {
                path.add(s.substring(startIndex, i+1));
            }else {
                continue;
            }
            backtracking(s, i+1, res, path);
            path.remove(path.size()-1);
        }
    }

    /**
     * 是否为回文串
     * @param arr 字符串
     * @return 结果
     */
    public static boolean isPartition(char[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
