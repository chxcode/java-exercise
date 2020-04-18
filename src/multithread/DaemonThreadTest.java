package multithread;

/**
 * @Author: ChangXuan
 * @Decription: 当最后一个非守护线程结束时，JVM会正常退出，而不管当前是否有守护线程。
 * @Date: 21:02 2020/4/18
 **/
public class DaemonThreadTest {
    public static void main(String[] args) {
        //daemonThreadTest();
        userThreadTest();
        System.out.println("main thread is over");
    }

    public static void daemonThreadTest(){
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){ }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
    public static void userThreadTest(){
        Thread userThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;){ }
            }
        });
        userThread.start();
    }

}
