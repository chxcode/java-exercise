package algorithm.queue;

import java.util.Stack;

/**
 * @Author: ChangXuan
 * @Decription: 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
 * @Date: 12:45 2020/6/19
 **/
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(Integer newNum){
        this.stackData.push(newNum);
        if (this.stackMin.isEmpty() || newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
    }

    public Integer pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        Integer value = this.stackData.pop();
        if (value.equals(this.getMin())){
            this.stackMin.pop();
        }
        return value;
    }

    public Integer getMin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("Yous stack is empty");
        }
        return this.stackMin.peek();
    }
}
