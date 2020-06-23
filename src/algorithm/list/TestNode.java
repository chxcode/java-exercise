package algorithm.list;

/**
 * @ClassName TestNode
 * @Description
 * @Author changxuan
 * @Date 2020/6/23 下午7:47
 **/
public class TestNode {
    public static void main(String[] args) {
        Node list = new Node(0);
        for (int i = 1; i < 10; i++){
            list.appendToTail(i);
        }
        list.deleteNode(7);

        list = list.appendToHead(7);

        list.print();
    }
}
