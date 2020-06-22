package strange;

/**
 * @Author: ChangXuan
 * @Decription: 对于for循环的理解 问题：请问最后一次输出的 p 的值是多少
 * @Date: 14:39 2020/6/22
 **/
public class Ergodic {
    public static void main(String[] args) {
        for (int i = 0, p = i; ;){
            System.out.println("i:"+i);
            System.out.println("p:"+p);
            i++;
            if (i == 10)
                break;
        }
    }
}
