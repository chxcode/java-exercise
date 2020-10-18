package leetcode.list;

/**
 * @Author: ChangXuan
 * @Decription: 删除链表的倒数第N个节点 https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @Date: 15:23 2020/10/18
 **/
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode curr = head, temp = head, pre = head;
        int length = 0;
        // 计算链表长度
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        if (n == length) return head.next;
        int i = 1;
        temp = head.next;
        n = length - n + 1;
        while (temp != null) {
            i++;
            if (i == n) {
                pre.next = temp.next;
                break;
            }
            pre = temp;
            temp = temp.next;
        }

        return head;
    }
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
