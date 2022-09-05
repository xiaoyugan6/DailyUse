package day07;

/**
 * @author lt
 * @Description
 * @data 7/19 - 15:30
 */
//Object类中的主要方法
//方法名称                               类型   描述
//public Object()                       构造   构造方法
//public boolean equals(Object obi)     普通   对象比较
//public int hashCode()                 普通   取得Hash码
//public String toString()              普通   对象打印时调用

public class Test {
    /**
     * 问题，想给test方法设置一个形参参数，这个参数我不确定到底会传进来一个什么类
     * 可以确定的是传递实参一定会是一个类，那么test方法的形参要设置一个什么类型？
     */
    public void test(Object obj){
    }

    public static void main(String[] args) {
        Test t = new Test();
        Person p = new Person();
        Student s = new Student();
        t.test(p);
        t.test(s);
        t.test(new Kk());//隐式对象
        Person e = new Person();
        e = p;
        System.out.println(p.equals(e));

        Object o = new Object();
        System.out.println(o.hashCode());

        System.out.println(p.toString());//toString打印出来的是当前引用的对象所在的内存地址
    }

}
