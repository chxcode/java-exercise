package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FindCommonCharacters
 * @Description 查找常用字符 https://leetcode-cn.com/problems/find-common-characters/
 * @Author changxuan
 * @Date 2020/10/14 下午8:19
 **/
public class FindCommonCharacters {

    public static void main(String[] args) {
        System.out.println((byte)('a'));
        String[] test = {"bella","label","roller"};
        commonChars(test)
        .stream().forEach(s -> System.out.println(s));
    }

    /**
     * 哈希
     * @param A
     * @return
     */
    public static List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        if (A.length == 1 || A.length == 0) return Arrays.asList(A);
        int[] hash = new int[26];
        char[] firstChars = A[0].toCharArray();
        for (int i = 0; i < firstChars.length; i++) {
            hash[firstChars[i] - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] othersHash = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                othersHash[A[i].toCharArray()[j] - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], othersHash[k]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (hash[i] !=0) {
                res.add(String.valueOf((char)('a'+i)));
                hash[i]--;
            }
        }
        return res;
    }
}
