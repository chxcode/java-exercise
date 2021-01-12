package multithread;

/**
 * @Author: ChangXuan
 * @Decription: 指令重排序
 * @Date: 14:00 2021/1/12
 **/
public class Reordering {
    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) { // (1)
                    System.out.println(num + num); // (2)
                }
                System.out.println("read thread ... ...");
            }
        }
    }
    public static class WriteThread extends Thread {
        @Override
        public void run() {
            num = 2; // (3)
            ready = true; //(4)
            System.out.println("writeThread set over ... ...");
        }
    }

    private static int num = 0;
    private static boolean ready = false;

    public static void main(String[] args) throws InterruptedException {
        /**
         * 分析： 由于代码 1，2，3，4 之间不存在依赖性，所以 WriteThread 的 3，4 有可能被重排序为 4，3.
         * 从而导致 ReadThread 中 1 处代码判断 ready 为 true 后，进行 num+num 运算，输出结果为 0，而
         * 不是预期的 4.
         *
         * 解决方法：给 ready 变量添加 volatile 修饰符。写 volatile 变量时，可以确保 volatile 写之前
         * 的操作不会被编译器重排序到 volatile 写之后。读 volatile 变量时。可以确保 volatile 读之后的
         * 操作不会被编译器重排序到 volatile 之前。
         */
        ReadThread rt = new ReadThread();
        rt.start();

        WriteThread wt = new WriteThread();
        wt.start();;

        Thread.sleep(10);
        rt.interrupt();
        System.out.println("main exit");
    }
}
