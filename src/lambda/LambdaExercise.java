package lambda;

import java.util.function.Function;

/**
 * @ClassName LambdaExercise
 * @Description lambda 表达式练习
 * @Author changxuan
 * @Date 2020-03-25 22:22
 **/
public class LambdaExercise {
    public static void main(String[] args){
        Function<Person, Integer> getAge = Person::getAge;
        Person person = new Person("lisi", 5);
        System.out.println(getAge.apply(person));

        MathOperation mathOperation = (a, b) -> {return a+b;};
        System.out.println(mathOperation.operation(3,4));

        new Thread(()->System.out.println("hello world")).start();
    }
}

class Person{
    private Integer age;
    private String name;

    public Person(String name, Integer age){
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
}

interface MathOperation{
    int operation(int a, int b);
}
