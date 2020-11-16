package basic;

/**
 * @Author: ChangXuan
 * @Decription: 单例模式
 * 双重校验锁
 * @Date: 15:07 2020/11/15
 **/
public class Singleton {
    // 使用 volatile 禁止JVM指令重排序
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
