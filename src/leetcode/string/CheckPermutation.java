package leetcode.string;

/**
 * @ClassName CheckPermutation
 * @Description 判定是否互为字符重排 https://leetcode-cn.com/problems/check-permutation-lcci/submissions/
 * @Author changxuan
 * @Date 2020/9/18 下午9:14
 **/
public class CheckPermutation {



    public boolean CheckPermutation(String s1, String s2) {
        int l1=s1.length(),l2=s2.length();
        if(l1!=l2)
            return false;
        int []index=new int[128];
        for(int i=0;i<l1;i++){
            index[s1.charAt(i)]++;
            index[s2.charAt(i)]--;
        }
        for(int i=0;i<128;i++){
            if(index[i]!=0)
                return false;
        }
        return true;
    }
}
