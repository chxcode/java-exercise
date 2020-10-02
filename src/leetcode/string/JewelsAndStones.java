package leetcode.string;

/**
 * @Author: ChangXuan
 * @Decription: 宝石和石头 https://leetcode-cn.com/problems/jewels-and-stones/
 * @Date: 22:30 2020/10/2
 **/
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) return 0;
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(S.substring(i, i+1))) result++;
        }
        return result;
    }
}
