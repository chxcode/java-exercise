package leetcode.array;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName MaxNumberOfSliderWin
 * @Description 滑动窗口的最大值 https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 * @Author changxuan
 * @Date 2020/9/28 下午8:11
 **/
public class MaxNumberOfSliderWin {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 ) return nums;
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            if(i > 0 && deque.peekFirst() == nums[i - 1])
                deque.removeFirst(); // 删除 deque 中对应的 nums[i-1]
            while(!deque.isEmpty() && deque.peekLast() < nums[j])
                deque.removeLast(); // 保持 deque 递减
            deque.addLast(nums[j]);
            if(i >= 0)
                res[i] = deque.peekFirst();  // 记录窗口最大值
        }
        return res;
    }
}