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
        for (int i = 10; i > 0; i--){
            stack.push(i);
        }

        // 栈排序
        stack.sort();

        while (stack.top != null){
            System.out.println(stack.pop());
        }
    }
}
