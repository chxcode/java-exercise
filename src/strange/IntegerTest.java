package strange;

/**
 * @ClassName IntergetTest
 * @Description
 * @Author changxuan
 * @Date 2020/7/29 下午11:41
 **/
public class IntegerTest {
    public static void main(String[] args) {
        Integer one = 1;
        test(one);
        //System.out.println(one == 1);
        switch (one){
            case 2:
                System.out.println(1);
            case 1:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }
    }

    public static void test(Integer one){
        System.out.println(one == 1);
    }
}
