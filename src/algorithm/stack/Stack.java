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
            throw new  RuntimeException("this stack is empty");
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

    int peek(){
        if (top == null){
            throw new  RuntimeException("this stack is empty");
        }
        return this.top.data;
    }

    Boolean isEmpty(){
        return top == null ? true : false;
    }

    void sort(){
        Stack help = new Stack();
        while (!this.isEmpty()){
            int cur = this.pop();
            while (!help.isEmpty() && help.peek()<cur){
                this.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            this.push(help.pop());
        }
    }
}
