package algorithm.stack;

import java.util.Stack;

/**
 * @Author: ChangXuan
 * @Decription: 逆序栈
 * @Date: 12:26 2020/6/22
 **/
public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("逆序前：");
        for (Integer item : stack){
            System.out.println(item);
        }
        reverse(stack);
        System.out.println("逆序后：");
        for (Integer item : stack){
            System.out.println(item);
        }
    }


    /**
     * 取出栈底元素
     * @param stack 栈
     * @return 栈底元素
     */
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            return result;
        }else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
