package leetcode.list;

/**
 * @ClassName MergeTwoSortedLists
 * @Description 合并有序链表
 * @Author changxuan
 * @Date 2020/8/28 下午8:24
 **/
public class MergeTwoSortedLists {
    /**
     * 巧用递归
     * @param l1 链表1
     * @param l2 链表2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
   }
}
