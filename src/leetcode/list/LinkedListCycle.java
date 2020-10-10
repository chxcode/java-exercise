package leetcode.list;

/**
 * @ClassName LinkedListCycle
 * @Description 环形链表 II https://leetcode-cn.com/problems/linked-list-cycle-ii/
 * @Date 2020/10/10 下午8:59
 **/
public class LinkedListCycle {
    /**
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
class ListNode {
    int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}
