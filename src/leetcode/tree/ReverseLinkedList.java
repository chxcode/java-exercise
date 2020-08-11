package leetcode.tree;

/**
 * @ClassName ReverseLinkedList
 * @Description 反转链表
 * @Author changxuan
 * @Date 2020/8/11 下午7:57
 **/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr, pre = null;
        while (head.next != null){
            curr = head.next;
            head.next = pre;
            pre = head;
            head = curr;
        }
        head.next = pre;
        return head;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
