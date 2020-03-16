package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName ClassUtils
 * @Description 类工具
 * @Author changxuan
 * @Date 2020-03-16 22:17
 **/
public class ClassUtils {

    public static void printAllProperty(Object object){
        Class c = object.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field item : fields){
            System.out.print(item.getType()+" "+item.getName()+"\n");
        }
    }

    public static void printAllMethod(Object object){
        Class c = object.getClass();
        Method[] methods = c.getDeclaredMethods();
        for (Method item : methods){
            System.out.print(item.getReturnType().getName()+" (");
            Class[] paramTypes = item.getParameterTypes();
            for (Class itemClass : paramTypes){
                System.out.print(itemClass.getName()+", ");
            }
            System.out.println(")");
        }
    }
}
