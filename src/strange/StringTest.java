package strange;

import java.nio.charset.Charset;

/**
 * @Author: ChangXuan
 * @Decription:
 * @Date: 11:37 2020/6/23
 **/
public class StringTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("abc");
        String t = null;
        builder.insert(3, t);
        System.out.println(builder.toString());
        System.out.println(8>>2);
        String str = "app/sss/a";
        System.out.println(str.getBytes()[0]);
        System.out.println(Charset.defaultCharset().name());
        System.out.println(str.replaceFirst("/","").replaceAll("/","-"));
    }
}
