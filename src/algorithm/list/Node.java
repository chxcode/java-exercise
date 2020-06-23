package algorithm.list;

/**
 * @ClassName Node
 * @Description 单链表
 * @Author changxuan
 * @Date 2020/6/23 下午7:33
 **/
public class Node {

    public int data;

    public Node next = null;

    public Node(int data){
        this.data = data;
    }

    /**
     * 尾插
     * @param d 元素
     */
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    /**
     * 头插
     * @param d 元素
     * @return 链表头
     */
    Node appendToHead(int d){
        Node end = new Node(d);
        end.next = this;
        return end;
    }

    /**
     * 打印元素
     */
    void print(){
        Node n = this;
        do {
            System.out.println(n.data);
            n = n.next;
        }while (n != null);
    }

    /**
     * 删除链表第一个某元素
     * @param d 元素
     * @return 表头
     */
    Node deleteNode(int d){
        Node n = this;
        if (n.data == d){
            return this.next;
        }
        while (n.next != null){
            if (n.next.data == d){
                n.next = n.next.next;
                return this;
            }
            n = n.next;
        }
        return this;
    }
}
