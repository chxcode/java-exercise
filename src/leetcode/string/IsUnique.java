package leetcode.string;

/**
 * @ClassName IsUnique
 * @Description 判定字符是否唯一
 * @Author changxuan
 * @Date 2020/9/1 下午10:12
 **/
public class IsUnique {
    public boolean isUnique(String astr) {
        char[] strArr = astr.toCharArray();
        for (int i = 0; i < strArr.length; i++){
            char curr = strArr[i];
            for (int j = i+1; j < strArr.length; j ++){
                if (curr == strArr[j])
                    return false;
            }
        }
        return true;
    }
}
