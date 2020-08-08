package leetcode.array;

/**
 * @ClassName DeleteNodeInALinkedList
 * @Description 删除链表中的节点
 * @Author changxuan
 * @Date 2020/8/8 下午7:30
 **/
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
