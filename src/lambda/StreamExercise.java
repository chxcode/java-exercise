package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: ChangXuan
 * @Decription: Stream 练习
 * @Date: 11:47 2020/10/3
 **/
public class StreamExercise {
    public static void main(String[] args) {
        Student hong = new Student("xiaohong", 19);
        Student gang = new Student("xiaogang", 10);
        List<Student> students = new ArrayList<>();
        students.add(hong);
        students.add(gang);
        students.add(hong);

        //<editor-fold desc="中间操作">
        // 基本过滤
        basicFilter(students);
        // 基本转换
        basicConvert(students);
        // 基本过滤+基本转换
        filterAndConvert(students);
        // 去重
        distinct(students);
        // 排序
        sort(students);
        // skip And limit
        skipAndLimit(students);
        // mapToLong
        mapToLong(students);
        // flatMap
        flatMap(students);
        //</editor-fold>

        // 最大/最小
        minAndMax(students);
        // 总数
        count(students);
        // 匹配 match
        match(students);
        // find any and find first
        findFirstAndAny(students);
        // 遍历 forEach
        forEach(students);
        // 转换数组 toArray
        toArray(students);
    }


    /**
     * 基本过滤
     * @param students 学生集合
     */
    public static void basicFilter(List<Student> students) {
        // 基本过滤
        List<Student> above15List = students.stream()
                .filter(s -> s.getAge()>15)
                .collect(Collectors.toList());
        System.out.println("基本过滤");
        for (Student student : above15List) {
            System.out.println(student.toString());
        }
    }

    /**
     * 基本转换
     * @param students 学生集合
     */
    public static void basicConvert(List<Student> students) {
        List<String> nameList= students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("基本转换");
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    /**
     * 基本过滤+转换
     * @param students 学生集合
     */
    public static void filterAndConvert(List<Student> students) {
        List<String> above15Names = students.stream()
                .filter(s -> s.getAge() > 15)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("基本过滤+转换");
        for (String name : above15Names) {
            System.out.println(name);
        }
    }

    /**
     * 去重
     * @param students 学生集合
     */
    public static void distinct(List<Student> students) {
        System.out.println("distinct");
        System.out.println("before");
        for (Student student : students) System.out.println(student.toString());
        List<Student> noRepeatList = students.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("after");
        for (Student student : noRepeatList) System.out.println(student.toString());
    }

    /**
     * 排序
     * @description comparing 默认为升序排列， reversed 则为降序排列
     * @param students 学生集合
     */
    public static void sort(List<Student> students) {
        System.out.println("排序（sorted）");
        List<Student> sortedList = students.stream()
                .sorted(Comparator.comparing(Student::getAge)
                    .reversed().thenComparing(Student::getName))
                .collect(Collectors.toList());
        for (Student student : sortedList) {
            System.out.println(student.toString());
        }
    }

    /**
     * skip and limit
     * skip : 跳过 n 个元素，从 1 开始计数。
     * limit : 此次取的元素数量。
     * ex. skip(1).limit(2) 跳过第一个，取出第二、第三个元素。
     * @param students 学生集合
     */
    public static void skipAndLimit(List<Student> students) {
        System.out.println("Skip And Limit");
        List<Student> partOfStudent = students.stream()
                .sorted(Comparator.comparing(Student::getAge)
                    .reversed())
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        for (Student student : partOfStudent) System.out.println(student.toString());
    }

    /**
     * 计算总和
     * 其它： mapToDouble、mapToInt
     * @param students 学生集合
     */
    public static void mapToLong(List<Student> students) {
        System.out.println("mapToLong");
        Long ageSum = students.stream()
                .mapToLong(Student::getAge)
                .sum();
        System.out.println(ageSum);
    }

    /**
     * flatMap
     * 接收一个函数 Mapper， 对流中的每一个元素，mapper 会将该元素转换为一个流 Stream ，然后把新生成流
     * 的每一个元素传递个下一个操作
     * @param students 学生集合
     */
    public static void flatMap(List<Student> students) {
        System.out.println("flatMap");
        List<String> lines = Arrays.asList(new String[]{"abc DEF", "hhhh", "fire"});
        List<String> words = lines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words);
    }

    /**
     * min and max
     * min and max method will return a Optional<T> Object that include some methods such as get,isPresent and so on.
     * @param students student Collection
     */
    public static void minAndMax(List<Student> students) {
        System.out.println("min and max");
        Student min = students.stream()
                .min(Comparator.comparing(Student::getAge))
                .get();
        System.out.println("min:"+min.toString());
        Student max = students.stream()
                .max(Comparator.comparing(Student::getAge))
                .get();
        System.out.println("max"+max.toString());
    }

    /**
     * 符合条件的元素数量 count
     * @param students student collection
     */
    public static void count(List<Student> students) {
        System.out.println("count");
        long above15Students = students.stream()
                .filter(student -> student.getAge() > 15)
                .count();
        System.out.println("年龄大于15的学生数量："+above15Students);
    }

    /**
     * 判断流中的元素是否满足某一条件
     * allMatch: 当流中的所有元素都满足条件时才返回 true
     * anyMatch: 只要流中有一个元素满足条件就返回 true
     * noneMatch: 只有流中的所有元素都不满足条件才返回 true
     * 如果流为空，那么都将返回 true
     * @param students 学生集合
     */
    public static void match(List<Student> students) {
        System.out.println("match");
        // 判断是否所有的学生年龄都大于 8 岁, 预期输出为 true
        boolean allMatch = students.stream()
                .allMatch(student -> student.getAge() > 8);
        System.out.println(allMatch);
        // 判断是否有学生年龄大于 15 岁，预期输出为 true
        boolean anyMatch = students.stream()
                .anyMatch(student -> student.getAge() > 15);
        System.out.println(anyMatch);
        // 判断是否有学生年龄大于 30 岁，预期输出为 true
        boolean noneMatch = students.stream()
                .noneMatch(student -> student.getAge() > 30);
        System.out.println(noneMatch);
    }

    /**
     * find first and find any
     * 获取第一个元素，获取任意一元素
     * @param students 学生集合
     */
    public static void findFirstAndAny(List<Student> students) {
        System.out.println("findFirst and findAny");
        Student firstStudent = students.stream()
                .findFirst()
                .get();
        System.out.println(firstStudent.toString());
        Student anyStudent = students.stream()
                .filter(student -> student.getAge() < 15)
                .findAny()
                .get();
        System.out.println(anyStudent.toString());
    }

    /**
     * 遍历
     * forEach 不保证处理的顺序
     * forEachOrdered 保证按照流中元素的出现顺序进行处理
     * 它们接受一个 Consumer 对象，对流中的每一个元素都传递给 Consumer
     * @param students 学生集合
     */
    public static void forEach(List<Student> students) {
        System.out.println("ForEach");
        students.stream()
                .forEach(student -> System.out.println(student.toString()));
        students.stream()
                .forEach(System.out::println);
    }

    /**
     * 将流转换数组
     * @param students 学生集合
     */
    public static void toArray(List<Student> students) {
        System.out.println("toArray");
        Student[] above15Students = students.stream()
                .filter(student -> student.getAge() > 15)
                .toArray(Student[]::new);
        System.out.println(Arrays.toString(above15Students));
    }
}

class Student {
    private String name;
    private Integer age;
    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
