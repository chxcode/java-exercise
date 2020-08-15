package leetcode.list;

/**
 * @ClassName CycleList
 * @Description
 * @Author changxuan
 * @Date 2020/8/15 下午8:19
 **/
public class CycleList {
    // 1. 可以考虑使用哈希表 记录访问的节点
    // 2. 进阶版：使用快慢指针，每次快指针都移动两步
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
