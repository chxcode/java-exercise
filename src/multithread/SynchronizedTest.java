package multithread;

/**
 * @ClassName SynchornizedTest
 * @Description
 * @Author changxuan
 * @Date 2020/7/19 下午4:43
 **/
public class SynchronizedTest {

    private volatile int init = 0;

    public void incr(){
        this.init++;
    }

    public int getInit() {
        return init;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest st = new SynchronizedTest();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10000; i++)
                    st.incr();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10000; i++)
                    st.incr();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< 10000; i++)
                    st.incr();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(st.getInit());
    }
    



}
