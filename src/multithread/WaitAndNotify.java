package multithread;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WaitAndNotify
 * @Description 生产者消费者
 * @Author changxuan
 * @Date 2020-04-13 22:43
 **/
public class WaitAndNotify {
    private static final Integer MAX_SIZE = 1;
    private static List<String> container = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

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
                    container.remove(0);
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
                    container.add("生产鸡蛋");
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
