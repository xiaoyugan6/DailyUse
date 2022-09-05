package day08;

/**
 * @author lt
 * @Description 单例(Singleton)设计模式-懒汉式
 * @data 7/25 - 8:07
 */

/**
 * 单例(Singleton)设计模式-懒汉式
 * 最开始，对象是null，直到有第一个人调用我，才new有一个对象，之后所有调用我的都用这个对象
 * 懒汉式和饿汉式的区别就是什么时候new这个对象，
 * 懒汉式是在第一次有人调用getInstance方法时来new对象，以后再有人调用getInstance，直接返回之前第一次new好的对象
 * 饿汉式，是在类加载之后，还没有人调用的时候，就先new好一个对象，后不论谁来调用getInstance方法，都是直接返回之前new好的对象
 */
//暂时懒汉式还存在线程安全问题，多线程时，可修复
public class Single1 {
    //先私有化构造，让外边不能直接new对象
    private Single1(){

    }

    private static Single1 s1 = null;

    public static Single1 getInstance(){
        if(s1 == null){
            s1 = new Single1();
        }
        return s1;
    }
}
