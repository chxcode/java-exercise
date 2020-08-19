package leetcode.array;

/**
 * @ClassName RemoveDuplicatesFromSortedArray
 * @Description  删除排序数组中的重复项
 * @Author changxuan
 * @Date 2020/8/19 下午12:50
 **/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
