package algorithm.stack;

/**
 * @ClassName TestStack
 * @Description
 * @Author changxuan
 * @Date 2020/6/23 下午8:17
 **/
public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++){
            stack.push(i);
        }
        while (stack.top != null){
            System.out.println(stack.pop());
        }
    }
}
