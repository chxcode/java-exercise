package leetcode.list;

import java.util.HashSet;

/**
 * @ClassName RemoveDuplicateNode
 * @Description 移除重复节点
 * @Author changxuan
 * @Date 2020/8/27 下午9:57
 **/
public class RemoveDuplicateNode {
    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> listValue = new HashSet<>();
        ListNode pre = head;
        if (pre == null)
            return null;
        else
            listValue.add(pre.val);
        ListNode curr = head.next;
        while (curr != null){
            if (listValue.contains(curr.val)){
                pre.next = curr.next;
            }else {
                listValue.add(curr.val);
                pre = curr;
            }
            curr = curr.next;
        }
        return head;

    }
    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
}
