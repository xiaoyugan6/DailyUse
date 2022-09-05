package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lt
 * @Description 集合、迭代器、泛型
 * @data 7/28 - 8:20
 */

/**
 * HashSet类  →  set接口  →  Collection接口
 *          实现        继承
 */

/**
 * HashSet集合判断两个元素相等的标准：两个对象通过equals()方法比较相等，并且两个对象的hashCode()方法返回值也相等。
 * 如果两个对象通过equals()方法返回true，这两个对象的hashCode()值也应该相同。
 */
public class Test3 {
    public static void main(String[] args) {
        Set set = new HashSet();
//        上等价于Set<Object> set = new HashSet<Object>();
        set.add(1);//添加
        set.add("a");
        System.out.println(set);

        set.remove(1);//移除
        System.out.println(set);

        System.out.println(set.contains("a"));//判断是否包含元素

        set.clear();
        System.out.println(set);//清空

        set.add("a");
        set.add("a");//set集合存的值不可重复
        set.add(1);
        set.add(true);
        set.add(null);//set不保证元素的排列顺序

        //使用迭代器遍历集合
        Iterator it = set.iterator();//Iterator迭代器
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //for each迭代集合，推荐使用for each迭代集合
        for (Object obj : set) {//定义一个Object类型的引用变量，把set的每个元素取出赋值给obj，直到循环set的所有值
            System.out.println(obj);
        }

        System.out.println(set.size());//获取集合元素个数

        //如果想要让集合只能存同样类型的对象，怎么做
        //使用泛型
        Set<String> set1 = new HashSet<String>();//指定String为集合的泛型
        set1.add("abc");
//        set1.add(1);


    }
}
