package day08;

/**
 * @author lt
 * @Description 单例(Single)设计模式-饿汉式
 * @data 7/24 - 8:56
 */

/**
 * 单例(Single)设计模式
 * 单例：只有一个实例化对象
 * 设计模式就是在我们实际编程过程中，逐渐总结出的一些解决问题的套路
 * 在整个软件系统运行过程中，这个类制备实例化一次，以后不论在哪都只调用这一个实例
 * 使用单例模式解决什么问题？一般是new对象太费劲，或者频频的new新的对象没有必要
 */

//假设构造中执行1000行代码，要占用很大的资源，耗时很长（10s）
//每一次new，Single对象需要10s，运行1000行代码
//像这种情况，就是适合单例模式，只new一次对象，以后一直使用这个对象

public class Single {
    //饿汉式的单例模式

    //私有的构造,调用这个类的人就不能直接使用new来创建对象
    private Single(){

    }

    //私有的single类型的类变量
    private static Single single = new Single();

    public static Single getInstance(){
        return single;
    }

}
