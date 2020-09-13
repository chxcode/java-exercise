package leetcode.array;

/**
 * @ClassName KthLargestElement
 * @Description 数组中的第K个最大元素 https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @Author changxuan
 * @Date 2020/8/11 下午7:33
 **/
public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++){
            boolean flag = false;
            for (int j = 1; j < nums.length - i; j++){
                if (nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
            if ((i + 1) == k || !flag) return nums[nums.length-k];
        }
        return nums[0];
    }
}
