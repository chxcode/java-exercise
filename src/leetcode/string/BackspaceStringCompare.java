package leetcode.string;

import java.util.Stack;

/**
 * @ClassName BackspaceStringCompare
 * @Description 比较含退格的字符串 https://leetcode-cn.com/problems/backspace-string-compare/
 * @Author changxuan
 * @Date 2020/10/19 下午8:12
 **/
public class BackspaceStringCompare {
    /**
     * "y#fo##f"
     * "y#f#o##f"
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }
    public static boolean backspaceCompare(String S, String T) {
        if (S.equals(T)) return true;
        Stack<Character> SQueue = new Stack<>();
        Stack<Character> TQueue = new Stack<>();
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] == '#' && !SQueue.isEmpty())
                SQueue.pop();
            else if (sArr[i] != '#')
                SQueue.push(sArr[i]);
        }
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == '#' && !TQueue.isEmpty())
                TQueue.pop();
            else if (tArr[i] != '#')
                TQueue.push(tArr[i]);
        }
        if (SQueue.size() != TQueue.size()) return false;
        while (!SQueue.isEmpty()) {
            if (SQueue.peek() == TQueue.peek()) {
                SQueue.pop();
                TQueue.pop();
            }else {
                return false;
            }
        }
        return true;
    }
}
