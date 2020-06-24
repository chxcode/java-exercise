package strange;

/**
 * @Author: ChangXuan
 * @Decription:
 * @Date: 11:37 2020/6/23
 **/
public class StringTest {
    public static void main(String[] args) {
        String str = "app/sss/a";
        System.out.println(str.replaceFirst("/","").replaceAll("/","-"));
    }
}
