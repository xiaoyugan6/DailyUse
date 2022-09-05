package day10;

/**
 * @author lt
 * @Description 操作集合的工具类：Collections
 * @data 8/18 - 9:57
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections是一个操作Set、List 和 Map等集合的工具类
 * Collections中提供了大量方法对集合元素进行排序、查询和修改等操作，还提供了集合对象设置不可变、对集合对象实现同步控制等方法
 * 排序操作：
 *   · reverse(List): 反转List中元素的顺序
 *   · shuffle(List): 对List集合元素进行随机排序
 *   · sort(List): 根据元素的自然顺序对指定List集合元素按升序排序
 *   · sort(List,Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序
 *   · swap(List,int,int):将指定list集合中的i处元素和j处元素进行交换
 */

/**
 * 同步控制
 * Collections类中提供了多个synchronizedXxx()方法，该方法可使将指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
 */
public class Test7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("cd");
        list.add("ca");
        list.add("a");
        list.add("a");
        list.add("1");

        System.out.println(list);
        Collections.reverse(list);//反转List中元素的顺序
        System.out.println(list);

        Collections.shuffle(list);//集合元素随机排序
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);//集合字典升序排列

        //返回指定集合中指定元素的出现次数
        System.out.println(Collections.frequency(list,"a"));//2

        //使用新值替换list对象中的所有旧值
        Collections.replaceAll(list,"a","aa");

        Collections.swap(list,0,4);//将指定list集合中的i处元素和j处元素进行交换
        System.out.println(list);

        System.out.println(Collections.max(list));//cd
        System.out.println(Collections.min(list));//1


        Student s1 = new Student(14,"张三");
        Student s2 = new Student(12,"李四");
        Student s3 = new Student(13,"王五");
        Student s4 = new Student(11,"小六");

        List<Student> stus = new ArrayList<Student>();
        stus.add(s1);
        stus.add(s2);
        stus.add(s3);
        stus.add(s4);

        //根据Comparator指定的顺序，返回给定集合中的最大元素
        Student s = Collections.max(stus, new Student());
        System.out.println(s.name + "," + s.age);//张三,14

        Student ss = Collections.min(stus, new Student());
        System.out.println(ss.name + "," + ss.age);//小六,11


//        for (Student stu : stus) {
//            System.out.println(stu.name + "," + stu.age);
//        }
//
//        Collections.sort(stus,new Student());
//        System.out.println("----------------");
//        for (Student stu : stus) {
//            System.out.println(stu.name + "," + stu.age);
//        }



    }

}

class Student implements Comparator<Student> {//Comparator比较器
    int age;
    String name;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Student o1, Student o2) {//根据年龄升序排列对象
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age < o2.age) {
            return -1;
        } else
            return 0;
    }
}
