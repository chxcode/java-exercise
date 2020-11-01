package leetcode.list;

/**
 * @ClassName KthNodeFromEndOfList
 * @Description 返回倒数第 k 个节点 https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 * @Author changxuan
 * @Date 2020/11/1 下午6:48
 **/
public class KthNodeFromEndOfList {
    public int kthToLast(ListNode head, int k) {
        ListNode pre = head, curr = head;
        while (k-- > 0) {
            pre = pre.next;
        }
        while (pre != null) {
            pre = pre.next;
            curr = curr.next;
        }
        return curr.val;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
