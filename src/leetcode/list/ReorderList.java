package leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ReorderList
 * @Description 重排链表 https://leetcode-cn.com/problems/reorder-list/
 * @Author changxuan
 * @Date 2020/10/20 下午8:13
 **/
public class ReorderList {

    // 配合线性表 达到可以随意访问元素的目的
    public void reorderList(ListNode head) {
        if (head == null) return;
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            if (i == j) break;
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
