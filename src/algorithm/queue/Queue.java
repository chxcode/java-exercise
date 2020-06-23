package algorithm.queue;

import algorithm.list.Node;

/**
 * @ClassName Queue
 * @Description 队列
 * @Author changxuan
 * @Date 2020/6/23 下午8:25
 **/
public class Queue {
    Node first, last;

    void enqueue(int data){
        if (first == null){
            last = new Node(data);
            first = last;
        }else {
            last.next = new Node(data);
            last = last.next;
        }
    }

    int dequeue(){
        if (first == null){
            throw new RuntimeException("Queue is empty");
        }
        int item = first.data;
        first = first.next;
        return item;
    }
}
