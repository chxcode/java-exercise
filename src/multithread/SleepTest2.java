package multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName SleepTest2
 * @Description 线程在睡眠时拥有的监视器资源不会被释放
 * @Author changxuan
 * @Date 2020-04-16 22:09
 **/
public class SleepTest2 {
    // 创建一个独占锁
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        // 创建线程 A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("child threadA is in sleep");
                    Thread.sleep(1000);
                    System.out.println("child threadA is in awake");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    // 释放锁
                    lock.unlock();
                }
            }
        });
        // 创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                // get lock
                lock.lock();
                try {
                    System.out.println("child threadB is in sleep");
                    Thread.sleep(1000);
                    System.out.println("child threadB is in awake");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
