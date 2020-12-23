package multithread;

/**
 * @ClassName DeadLockTest2
 * @Description 线程死锁 Demo
 * @Author changxuan
 * @Date 2020/12/23 下午10:32
 **/
public class DeadLockTest2 {
    // 创建资源
    private static Object resourcesA = new Object();
    private static Object resourcesB = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        synchronized (resourcesA) {
                            System.out.println(Thread.currentThread() + "get ResourcesA");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread() + "waiting get ResourcesB");
                            synchronized (resourcesB) {
                                System.out.println(Thread.currentThread() + "get ResourcesB");
                            }
                        }
                    }
                }
        );

        Thread threadB = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        synchronized (resourcesB) {
                            System.out.println(Thread.currentThread() + "get ResourcesB");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread() + "waiting get ResourcesA");
                            synchronized (resourcesA) {
                                System.out.println(Thread.currentThread() + "get ResourcesA");
                            }
                        }
                    }
                }
        );

        // 启动线程
        threadA.start();
        threadB.start();
    }
}
