package multithread;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @ClassName TestUnsafe
 * @Description Unsafe
 * @Author changxuan
 * @Date 2021/1/11 下午10:07
 **/
public class TestUnsafe {
    static Unsafe unsafe;
    static long stateOffset;

    private volatile long state = 0;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
            stateOffset = unsafe.objectFieldOffset(
                    TestUnsafe.class.getDeclaredField("state"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestUnsafe testUnsafe = new TestUnsafe();
        Boolean success = unsafe.compareAndSwapInt(testUnsafe, stateOffset, 0, 1);
        System.out.println(success);
        // 输出 1
        System.out.println(testUnsafe.state);
    }
}
