package strange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @ClassName ArrayListTest
 * @Description
 * @Author changxuan
 * @Date 2020/7/12 下午6:16
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> ids = new ArrayList<>();

        ids.add(3);
        ids.add(2);
        ids.add(5);
        ids.add(1);

        System.out.println(Arrays.toString(ids.toArray()));
        // 错误用法
//        for (Integer id : ids){
//            if (id == 2){
//                ids.add(4);
//                ids.remove(id);
//            }
//        }

        // 正确用法
        Iterator<Integer> list = ids.iterator();
        while (list.hasNext()) {
            if (list.next() == 2) {
                list.remove();
            }
        }
        System.out.println(Arrays.toString(ids.toArray()));


        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("小明", 1);
        Student student2 = new Student("小红", 2);
        Student student3 = new Student("小亮", 3);
        Student student4 = new Student("小刚", 4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student student : students) {
            if (student.age == 2) {
                student.name = "小美";
            }
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    static class Student {

        Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        private String name;
        private Integer age;

        @Override
        public String toString() {
            return "{name:" + name + ",age:" + age + "}";
        }

    }
}

