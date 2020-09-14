package leetcode.array;


import java.util.Stack;

/**
 * @ClassName ValidParentheses
 * @Description 有效括号 https://leetcode-cn.com/problems/valid-parentheses/
 * @Author changxuan
 * @Date 2020/8/14 下午9:12
 **/
public class ValidParentheses {

    private Stack<Character> stack = new Stack<Character>();

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        char[] sArr = s.toCharArray();
        int i = 0, j = s.length();
        while (i < j){
            switch (sArr[i]){
                case '(':
                case '[':
                case '{':
                    stack.push(sArr[i]);
                    break;
                default:
                    if (stack.peek().equals(sArr[i]))
                        stack.pop();
                    else
                        return false;
            }
        }
        return true;
    }

    public boolean isValidPro(String s) {
        if (s.length() % 2 != 0)
            return false;
        char[] sArr = s.toCharArray();
        char[] temp = new char[sArr.length];
        int j = 0;
        for (int i = 0; i < sArr.length; i++){
            switch (sArr[i]) {
                case '(':
                case '[':
                case '{':
                    temp[j] = sArr[i];
                    j++;
                    break;
                default:
                    if (j != 0 && judge(temp[j-1], sArr[i]))
                        j--;
                    else
                        return false;
            }
        }
        return j == 0 ? true : false;
    }

    public boolean judge(char right, char left){
        if (right == '(' && left == ')')
            return true;
        if (right == '[' && left == ']')
            return true;
        if (right == '{' && left == '}')
            return true;
        return false;
    }
}
