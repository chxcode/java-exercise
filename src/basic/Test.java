package basic;

/**
 * @ClassName Test
 * @Description
 * @Author changxuan
 * @Date 2020/7/11 下午9:21
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println(SizeEnum.SMALL.ordinal());
        Integer i = 1234567;
        Long l = 999l;
        System.out.println(i.hashCode());
        System.out.println(Integer.rotateLeft(i, 4));

        String str1 = "1111";
        String str2 = "1111";
        System.out.println(str1 == str2);
    }
}
