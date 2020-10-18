package leetcode.list;

/**
 * @ClassName ReverseLinkedList
 * @Description 反转链表  https://leetcode-cn.com/problems/reverse-linked-list
 * @Author changxuan
 * @Date 2020/8/11 下午7:57
 **/
public class ReverseLinkedList {

    public ListNode reverseListPro(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

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
