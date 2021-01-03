package leetcode.list;

/**
 * @ClassName PartitionList
 * @Description  分隔链表 https://leetcode-cn.com/problems/partition-list/
 * @Author changxuan
 * @Date 2021/1/3 下午9:41
 **/
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}
