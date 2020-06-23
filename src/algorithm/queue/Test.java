package algorithm.queue;

/**
 * @Author: ChangXuan
 * @Decription: 栈测试类
 * @Date: 12:58 2020/6/19
 **/
public class Test {

    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++){
            queue.enqueue(i);
        }
        do {
            System.out.println(queue.dequeue());
        }while (queue.first != null);
    }
}
