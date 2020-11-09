package leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PalindromeLinkedList
 * @Description 回文链表 https://leetcode-cn.com/problems/palindrome-linked-list/
 * @Author changxuan
 * @Date 2020/10/23 下午9:33
 **/
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();

        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        // 使用双指针判断是否回文
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}