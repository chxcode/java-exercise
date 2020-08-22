package leetcode.array;

/**
 * @Author: ChangXuan
 * @Decription: 移除元素
 * @Date: 22:39 2020/8/22
 **/
public class RemoveElement {
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
