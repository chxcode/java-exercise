package multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName ThreadTest
 * @Description 线程创建的三种方式
 * @Author changxuan
 * @Date 2020-04-13 21:33
 **/
public class ThreadTest {
    // 1.继承 Thread 并重写 run 方法
    public static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("I'm a child thread created by extends Thread Class.");
        }
    }

    // 2.实现 Runnable 接口
    public static class RunnableTask implements Runnable{
        private String flag = "";

        @Override
        public void run(){
            System.out.println("I'm a "+flag+" child thread created by implements Runnable.");
        }
    }

    public static class CallerTask implements Callable<String>{
        @Override
        public String call() throws Exception{

            return "hello";
        }
    }


    public static void main(String[] args) throws InterruptedException {
        // 1.创建线程
        MyThread myThread = new MyThread();
        // 启动线程
        myThread.start();

        // 2.Runnable
        RunnableTask runnableTask = new RunnableTask();
        new Thread(runnableTask).start();
        new Thread(runnableTask).start();

        // 3.创建异步任务
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        // 启动线程
        new Thread(futureTask).start();
        try {
            // 等待任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
