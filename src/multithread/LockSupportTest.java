package multithread;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName LocalSupportTest
 * @Description LocalSupport 测试类
 * @Author changxuan
 * @Date 2020/5/30 上午10:34
 **/
public class LockSupportTest {
    public static void main(String[] args) {
        testOne();
    }


    public static void testOne(){
        System.out.println("begin park");
        LockSupport.park();
        System.out.println("end park");
    }
}
