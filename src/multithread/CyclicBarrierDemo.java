package multithread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CyclicBarrierDemo
 * @Description
 * @Author changxuan
 * @Date 2020-03-31 23:05
 **/
public class CyclicBarrierDemo {
    public static void main(String[] args){
        // human number
        final CyclicBarrier cb = new CyclicBarrier(3);
        Long start = System.currentTimeMillis();
        // 模拟三个用户
        for (int i = 0; i < 9; i++){
            final int user = i + 1;
            new Thread(()->{
                try {
                    Thread.sleep((long)(Math.random()*10000));
                    System.out.println(user + "到达聚餐地点，当前已有"+(cb.getNumberWaiting()+1)+"人到达");
                    // 阻塞
                    cb.await();

                    System.out.println("人员到齐开始吃饭");
                    Thread.sleep((long)(Math.random()*10000));
                    System.out.println(user+"吃完回家");

                }catch (InterruptedException | BrokenBarrierException e){
                    e.printStackTrace();
                }
            }).start();
        }
        Long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
    }
}
