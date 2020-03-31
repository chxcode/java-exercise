package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName SemaphoreDemo
 * @Description
 * @Author changxuan
 * @Date 2020-03-31 22:47
 **/
public class SemaphoreDemo {
    /**
     * 执行任务类
     */
    class SemaphoreRunnable implements Runnable{

        private Semaphore semaphore;
        private int user;

        public SemaphoreRunnable(Semaphore semaphore, int user){
            this.semaphore = semaphore;
            this.user = user;
            this.user = user;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("用户【"+user+"】进入窗口，准备买票...");
                Thread.sleep((long)(Math.random()*10000));
                System.out.println("用户【"+user+"】买票完成，准备离开...");
                Thread.sleep((long)(Math.random()*10000));
                System.out.println("用户【"+user+"】离开窗口，准备出门...");
                semaphore.release();

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private void execute(){
        // 定义信号量
        final Semaphore semaphore = new Semaphore(2);
        // 定义线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++){
            threadPool.execute(new SemaphoreRunnable(semaphore, (i+1)));
        }
        threadPool.shutdown();
    }

    public static void main(String[] args){
        SemaphoreDemo sd = new SemaphoreDemo();
        sd.execute();
    }
}
