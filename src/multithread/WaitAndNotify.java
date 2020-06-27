package multithread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName WaitAndNotify
 * @Description 生产者消费者
 * @Author changxuan
 * @Date 2020-04-13 22:43
 **/
public class WaitAndNotify {
    private static final Integer MAX_SIZE = 3;
    private static Queue<String> container = new LinkedList<String>();
    public static void main(String[] args) {

        new Thread(()->{
            while (true) {
                synchronized (container) {
                    while (container.size() == 0) {
                        try {
                            container.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("消费者消费鸡蛋");
                    container.poll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    container.notifyAll();
                }
            }
        }).start();

        new Thread(()->{
            while (true) {
                synchronized (container) {
                    while (container.size() == MAX_SIZE) {
                        try {
                            container.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("生产者生产鸡蛋");
                    container.offer("鸡蛋");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    container.notifyAll();
                }
            }
        }).start();

    }
}
