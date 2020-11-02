package leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName IntersectionOfTwoArrays
 * @Description 两个数组的交集 https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @Author changxuan
 * @Date 2020/11/2 下午8:42
 **/
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> parentSet = new HashSet<>();
        Set<Integer> childSet = new HashSet<>();
        for (int num : nums1) {
            parentSet.add(num);
        }
        for (int num : nums2) {
            if (parentSet.contains(num)) {
                childSet.add(num);
            }
        }
        int[] resArr = new int[childSet.size()];
        int index = 0;
        for (int value : childSet) {
            resArr[index++] = value;
        }
        return resArr;

    }
}
