package strange;

/**
 * @Author: ChangXuan
 * @Decription: 对于 Integer 和 int 做为类的属性，实例化对象的时候 Integer 为 null，int 为 0
 * @Date: 14:34 2020/6/22
 **/
public class TypeInit {
    public static void main(String[] args) {
        User user = new User();
        user.name = "小明";
        System.out.println(user.age);
    }
}
class User{

    int age;

    Integer money;

    String name;
}