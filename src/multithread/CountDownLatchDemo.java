package multithread;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemo
 * @Description
 * @Author changxuan
 * @Date 2020-04-01 21:25
 **/
public class CountDownLatchDemo {

    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(()->{
            try {
                System.out.println("Task One Running");
                Thread.sleep((long)(Math.random()*10000));
                System.out.println("Task One End!");
                countDownLatch.countDown();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                System.out.println("Task Two Running");
                Thread.sleep((long)(Math.random()*10000));
                System.out.println("Task Two End!");
                countDownLatch.countDown();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();
        System.out.println("等待其它两个任务执行完毕，主线程才开始执行任务："+ Thread.currentThread().getName());
        try {
            countDownLatch.await();
            System.out.println("Main Task Running...");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
