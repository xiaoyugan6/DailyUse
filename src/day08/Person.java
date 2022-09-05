package day08;

/**
 * @author lt
 * @Description ※String对象的创建
 * @data 7/19 - 16:58
 */

/**
 * 1.字面量创建String对象
 * String s1 = "abc"; 在堆中的字符串常量池中添加"abc"常量，返回引用地址给s1对象。
 * String s2 = "abc"; 通过equals()方法判断常量池中已有值为abc的对象，返回相同的引用。
 * System.out.println(s1 == s2); true,所以s1 == s2
 * 2.new创建String对象
 * String s3 = new String("def"); 在字符串常量池中添加"def"对象，在堆中创建值为"def"的对象s3，返回指向堆中s3的引用。
 * String s4 = new String("def"); 常量池中已有值为"def"的对象，不做处理，在堆中创建值为"def"的对象s4，返回指向堆中s4的引用。
 * String s5 = "x" + "y"; 经过JVM优化，直接在常量池中添加"xy"对象。
 * String s6 = new String("1") + new String("1") +new String("2");
 * 通过StringBuilder实现，在常量池中添加"1"和"2"两个对象，在堆中创建值为"112"的对象，把引用地址给s6。
 */
//总结：字面量创建对象的时候，只在常量池创建一个对象。new的时候，常量池有对象，堆中也要有对象。字面量方法要比new省内存。


public class Person {
    public void test(){
        System.out.println("这是person的test方法");
    }

}
