package leetcode.array;

/**
 * @ClassName MagicIndexLcci
 * @Description 魔术索引
 * @Author changxuan
 * @Date 2020/7/31 下午9:54
 **/
public class MagicIndexLcci {

    public static void main(String[] args) {
        int[] arrays = {0};
        System.out.println(findMagicIndex(arrays));
    }

    public static int findMagicIndex(int[] nums) {
        return divideFind(nums, 0, nums.length-1);
    }

    public static int divideFind(int[] arrays, int low, int high){
        if (low > high){
            return -1;
        }
        int mid = (high-low) / 2 + low;
        int result = divideFind(arrays, low, mid-1);
        if (result != -1){
            return result;
        }else if (mid == arrays[mid]){
            return mid;
        }
        return divideFind(arrays, mid+1, high);

    }
}
