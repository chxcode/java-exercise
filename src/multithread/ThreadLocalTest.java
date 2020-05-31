package multithread;

/**
 * @Author: ChangXuan
 * @Decription:
 * @Date: 21:38 2020/4/18
 **/
public class ThreadLocalTest {
    // 创建 ThreadLocal 变量
    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    static void print(String str){
        // 打印当前线程本地内存中的 localVariable 变量的值
        System.out.println(str + ":" +localVariable.get());
        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                // 设置线程One中本地变量localVariable的值
                localVariable.set("threadOne local variable");
                print("threadOne");
                System.out.println("threadONe remove after"+":"+localVariable.get());
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                // 设置线程One中本地变量localVariable的值
                localVariable.set("threadTwo local variable");
                print("threadTwo");
                System.out.println("threadTwo remove after"+":"+localVariable.get());
            }
        });
        threadOne.start();
        threadTwo.start();
    }

}
