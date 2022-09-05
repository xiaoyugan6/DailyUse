package day11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lt
 * @Description 泛型、泛型类
 * @data 8/22 - 8:06
 */

/**
 *     泛型，JDK1.5新加入的，解决数据类型的安全性问题，其主要原理是在类声明时通过一个标识表示类中的某个属性或者是某个方法的返回值
 * 及参数类型。
 *     Java泛型可以保证如果程序在编译时没有发生警告，运行时就不会产生ClassCastException异常。同时，代码更加简洁、健壮。
 */

/**
 * Java中的泛型，只在编译阶段有效。在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦除，并且在对象进入和离开方法的边界处添加
 * 类型检查和类型转换的方法。也就是说，泛型信息是不会进入到运行阶段。
 */

/**
 * 泛型类
 * 对象实例化时不指定泛型，默认为：Object
 * 泛型不同的引用不能互相赋值。
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(111);
        list.add("sss");
        list.add(true);

        //需求只能在集合中存字符串
        List<String> l = new ArrayList<>();
        l.add("xx");
//        l.add(true);这个是编译期发现的问题

        A<String> a1 = new A<String>();//在new A的对象指定泛型的类型String
        a1.setKey("xxxx");
        String s = a1.getKey();

        A<Integer> a2 = new A<Integer>();
        a2.setKey(1);
        Integer i = a2.getKey();

        A a3 = new A();//不指定泛型，相当于指定了一个Object类型
        a3.setKey(new Object());
        Object obj = a3.getKey();

        //同样的类，但是在new对象的时泛型指定不同的数据类型，这些对象不能互相赋值（不同数据类型）
    }
}

/**
 * 此处的泛型T可以任意的取名，A,B,V
 * 一般使用T,意为type
 * @param <T>
 */
class A<T>{
    private T key;

    public void setKey(T key){
        this.key = key;
    }

    public T getKey(){
        return this.key;
    }
}