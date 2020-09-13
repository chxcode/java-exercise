package leetcode.array;

/**
 * @Author: ChangXuan
 * @Decription: 移除元素 https://leetcode-cn.com/problems/remove-element/
 * @Date: 22:39 2020/8/22
 **/
public class RemoveElement {

    /**
     * 快慢指针
     * @param nums 数组
     * @param val 被移除元素
     * @return 新数组长度
     */
    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 0;
        while(q < nums.length){
            if(nums[q] != val){
                nums[p] = nums[q];
                p++;
            }
            q++;
        }
        return p;
    }
}
