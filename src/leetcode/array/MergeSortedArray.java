package leetcode.array;

/**
 * @ClassName MergeSortedArray
 * @Description 合并有序数组
 * @Author changxuan
 * @Date 2020/8/18 下午8:25
 **/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int i = 0, j = 0, l = 0;
        while (i < m || j < n){
            if ( i < m && j < n){
                if (nums1[i] < nums2[j]){
                    result[l] = nums1[i];
                    i++;
                }else {
                    result[l] = nums2[j];
                    j++;
                }
            }else {
                if (i < m){
                    result[l] = nums1[i];
                    i++;
                }
                if (j < n){
                    result[l] = nums2[j];
                    j++;
                }
            }
            l++;
        }
        System.arraycopy(result, 0, nums1, 0, result.length);
    }
}
