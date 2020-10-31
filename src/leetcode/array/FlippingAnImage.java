package leetcode.array;

/**
 * @ClassName FlippingAnImage
 * @Description 反转图像 https://leetcode-cn.com/problems/flipping-an-image/
 * @Author changxuan
 * @Date 2020/10/31 下午7:21
 **/
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int pre = 0, back = A[i].length-1, temp;
            while (pre < back) {
                temp = A[i][pre];
                A[i][pre] = A[i][back];
                A[i][back] = temp;
                pre++;
                back++;
            }
        }
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                }else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
