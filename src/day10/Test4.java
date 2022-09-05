package day10;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author lt
 * @Description TreeSet
 * @data 7/28 - 11:14
 */

/**
 * TreeSet类  →  NavigableSet接口  →  SortSet接口  →  Set接口  →  Collection接口
 *          实现                 继承            继承        继承
 */

/**
 * TreeSet是SortedSet接口的实现类，TreeSet可以确保集合元素处于排序状态。
 * TreeSet支持两种排序方式：自然排序和定制排序。默认情况下，TreeSet采用自然排序。
 * 自然排序：TreeSet会调用集合元素的compareTo(Object obj)方法类比较元素之间的大小关系，然后将集合元素按升序排列
 * ·如果this > obj,返回正数1
 * ·如果this < obj,返回负数-1
 * ·如果this = obj,则认为这两个对象相等
 * ·必须放入同样类的对象.(默认会进行排序)否则可能会发生类型转化异常,我们可以使用泛型来进行限制
 */
public class Test4 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
//自然排序
        set.add(5);
        set.add(2);
        set.add(3);
        System.out.println(set);//[2,3,5]
        set.remove(5);
        set.contains(3);
//        set.clear();

        //使用迭代器遍历集合
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //for each迭代集合，推荐使用for each迭代集合
        for (Integer i : set){
            System.out.println(i);
        }

        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",50);
        Person p3 = new Person("王二",60);
        Person p4 = new Person("Lucy",29);

        Set<Person> set2 = new TreeSet<Person>(new Person());
        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p4);

        for (Person p : set2){
            System.out.println(p.name + "  " + p.age);
        }


    }
}

//定制排序：如果需要实现定制排序，则需要在创建TreeSet集合对象时，提供给一个Comparator接口的实现类对象。
//由该Comparator对象负责集合元素的排序逻辑。
class Person implements Comparator<Person> {//把Person对象存到TreeSet中并按照年龄排序
    int age;
    String name;
    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) {//年龄正序排列
        if (o1.age > o2.age){
            return 1;
        }else if (o1.age < o2.age){
            return -1;
        }else {
            return 0;
        }

    }
}