package strange;

/**
 * @ClassName HashTest
 * @Description test
 * @Author changxuan
 * @Date 2020/9/19 下午3:47
 **/
public class HashTest {
    public static void main(String[] args) {
        Integer one = 8;
        System.out.println(one.hashCode());
        System.out.println(one.toString());
        System.out.println(Integer.reverseBytes(one));
    }
}
