package algorithm.stack;

import algorithm.list.Node;

/**
 * @ClassName Stack
 * @Description 链栈
 * @Author changxuan
 * @Date 2020/6/23 下午8:05
 **/
public class Stack {
    Node top;

    /**
     * 出栈
     * @return 栈顶元素
     */
    int pop(){
        if (top == null){
            throw new  RuntimeException("");
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    /**
     * 入栈
     */
    void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    }
}
