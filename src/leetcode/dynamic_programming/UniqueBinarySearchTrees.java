package leetcode.dynamic_programming;

/**
 * @ClassName UniqueBinarySearchTrees
 * @Description Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
 * @Author changxuan
 * @Date 2020/6/30 下午10:02
 **/
public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }

    public static int numTrees(int n){
        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <=n; i++){
            for (int j = 1; j <= i; j ++){
                count[i] += count[j-1] * count[i-j];
            }
        }
        return count[n];
    }
}
