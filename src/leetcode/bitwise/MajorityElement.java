package leetcode.bitwise;

/**
 * @ClassName MajorityElement
 * @Description 多数元素
 * https://leetcode-cn.com/problems/majority-element/
 * @Author changxuan
 * @Date 2020/8/12 下午7:57
 **/
public class MajorityElement {

    public static void main(String[] args) {
        int[] test = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(test));
    }
    // 使用投票法
    public static int majorityElement(int[] nums) {
        int major = 0, count = 0;
        for (int i = 0; i < nums.length; i++){
            if (count == 0 || (count > 0 && major == nums[i])){
                major = nums[i];
                count++;
            }else {
                count--;
            }
        }
        return major;
    }
}
