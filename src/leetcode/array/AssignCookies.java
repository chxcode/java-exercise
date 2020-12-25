package leetcode.array;

import java.util.Arrays;

/**
 * @ClassName AssignCookies
 * @Description 分发饼干 https://leetcode-cn.com/problems/assign-cookies/
 * @Author changxuan
 * @Date 2020/12/25 下午8:07
 **/
public class AssignCookies {
    public static void main(String[] args) {
        int[] s = new int[]{1,5,3};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int sIndex = s.length-1;
        int gIndex = g.length-1;
        int res = 0;
        while (sIndex > -1 && gIndex > -1) {
            if (s[sIndex] >= g[gIndex]) {
                res++;
                sIndex--;
                gIndex--;
            } else {
                gIndex--;
            }
        }
        return res;
    }
}
