package day10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lt
 * @Description List与ArrayList、Vector
 * @data 7/28 - 15:17
 */
/**
 * Collection接口
 *   继承⬆
 *   List接口
 *   实现⬆
 * ArrayList类
 */

/**
 * List代表一个元素有序、且可重复的集合，集合中的每个元素都有对应的顺序索引
 * List允许使用重复元素，可以通过索引来访问指定位置的集合元素。
 * List默认按元素的添加顺序设置元素的索引。
 * List集合里添加了一些根据索引来操作集合元素的方法。
 */

/**
 * Array和Vector是List接口的两个典型实现
 * 区别：
 *      · Vector是一个古老是集合，通常建议使用ArrayList
 *      · ArrayList线程不安全，而Vector线程安全
 *      · 即使为保证List集合线程安全，也不推荐使用Vector
 */
public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();//List是接口，接口对象是可以接收实现类的new的对象
        list.add("b");//索引下标0
        list.add("d");//1
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println(list);//[b,d,c,a,d]
        System.out.println(list.get(2));//c,访问元素

        list.add(1,"f");//插入数据
        System.out.println(list);//[b,f,d,c,a,d]

        List<String> l = new ArrayList<String>();
        l.add("123");
        l.add("456");
        list.addAll(2,l);//插入集合
        System.out.println(list);//[b,f,123,456,d,c,a,d]

        System.out.println(list.indexOf("d"));//4，获取指定元素在集合中第一次出现的索引下标
        System.out.println(list.lastIndexOf("d"));//7,获取指定元素在集合中最后一次出现的索引下标

        list.remove(2);//移除元素
        System.out.println(list);//[b,f,456,d,c,a,d]

        list.set(1,"ff");//修改元素
        System.out.println(list);//[b,ff,456,d,c,a,d]

        List<String> sublist = list.subList(2,4);//截取[2,4)
        System.out.println(sublist);//[456,d]

        System.out.println(list.size());//长度

    }
}
