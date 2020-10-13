package leetcode.list;

/**
 * @ClassName SwapNodesInPairs
 * @Description 两两交换链表中的节点 https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @Author changxuan
 * @Date 2020/10/13 下午8:19
 **/
public class SwapNodesInPairs {

    /**
     * 递归解法
     * @param head
     * @return
     */
    public ListNode swapPairsPro(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
    /**
     * 非递归解法
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode temp = null;
        ListNode curr = head.next;
        ListNode res = head.next;
        do {
            prev.next = curr.next;
            curr.next = prev;
            if (temp != null) {
                temp.next = curr;
            }
            temp = prev;
            prev = prev.next;
            if (prev == null) break;
            curr = prev.next;
        }while (prev != null && curr != null);
        return res;
    }


    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
