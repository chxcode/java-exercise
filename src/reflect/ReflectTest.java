package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ArrayTest
 * @Description
 * @Author changxuan
 * @Date 2020-03-16 22:22
 **/
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
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


        // 使用反射绕过泛型的类型检查
        List<String> strings = new ArrayList<>();
        strings.add("hello");

        Method listAdd = strings.getClass().getMethod("add", Object.class);
        listAdd.invoke(strings, 2);

        System.out.println(strings);


        // 1.通过类装载器获取 Car 对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("reflect.Car");

        // 2.获取类的默认构造器对象并通过它实例化 Car
        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car)constructor.newInstance();

        // 3.通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "宝马");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "白色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 500);

        System.out.println(car.toString());
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
