package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OutOfMemoryTest
 * @Description 内存溢出测试
 * @Author changxuan
 * @Date 2020/9/23 下午9:16
 **/
public class OutOfMemoryTest {
    static class OOMObject {

    }
    public static void main(String[] args) {
        // 堆内存溢出
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
