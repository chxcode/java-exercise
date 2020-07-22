package strange;

/**
 * @ClassName CompareSpeed
 * @Description
 * @Author changxuan
 * @Date 2020/7/22 下午8:13
 **/
public class CompareSpeed {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++){
            move();
        }
        System.out.println(System.currentTimeMillis()-start);
    }
    public static void division(){
        long n = 7878767536l/2048;
    }
    public static void move(){
        long n = 7878767536l>>11;
    }
}
