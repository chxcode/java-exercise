package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author changxuan
 * @Date 2020-03-16 22:22
 **/
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        String str = "1";
//        Integer i = 1;
//        ClassUtils.printAllProperty(i);
//        ClassUtils.printAllMethod(str);

        // 获取类的信息 调用类的方法
        A a = new A();
        Class c = a.getClass();

        // getMethod => 所有修饰符为 public 的方法，包括继承自超类的方法
        // getDeclaredMethod => 当前类中所有自己声明的方法
        // Method m = c.getMethod("print", new Class[]{int.class,int.class});
        Method m = c.getDeclaredMethod("print", int.class, int.class);
        // 将私有方法设置为可访问
        m.setAccessible(true);
        m.invoke(a, 10, 20);

        Method mStr = c.getMethod("print", String.class, String.class);
        mStr.invoke(a, "hello", "world");


        // 使用反射绕过范型类型检查
        List<String> strings = new ArrayList<>();
        strings.add("hello");

        Method listAdd = strings.getClass().getMethod("add", Object.class);
        listAdd.invoke(strings, 2);

        System.out.println(strings);
    }
}

class A{
    private void print(int a, int b){
        System.out.println(a+b);
    }

    public void print(String a, String b){
        System.out.println(a+" "+b);
    }

}
