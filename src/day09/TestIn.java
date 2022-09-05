package day09;

/**
 * @Description: 接口
 * @Author: lt
 * @Date: 2022/7/26 14:31
 */

/**
 * 有时必须从几个类中派生出一个子类，继承它们所有的属性和方法。但是，Java不支持多重继承。有了接口，就可以得到多重继承的效果。
 * 接口是抽象方法和常量值的集合。
 * 从本质上讲，接口是一种特殊的抽象类，这种抽象类中只包含常量和方法的定义，而没有变量和方法的实现。
 * 实现接口类：class SubClass implements InterfaceA{}
 * 一个类可以实现多个接口，接口也可以继承其他接口。
 */

/**
 * 接口的特点：
 * 用interface来定义。
 * 接口中所有成员变量都默认是由public static final修饰的。
 * 接口中所有的方法都是默认由public abstract修饰的。
 * 接口中没有构造器。
 * 接口采用多层继承机制。
 */

/**
 * 实现接口的类中必须提供接口中所有方法的具体实现内容，方可实例化。否则，仍未抽象类。
 * 如果实现接口的类中没有实现接口的全部方法,必须将此类定义为抽象类
 * ※接口的主要用途就是被现实类实现。（面向接口编程）
 * 与继承关系类似，接口与实现类之间存在多态性
 * 定义Java类的语法格式：先写extends，后写implements
 */

//问题：接口和抽象类很相似，好像接口能做的事用抽象类也能做，干嘛还要用接口呢？
//父类需要稳定的抽象，如果父类老是在改，基于这个父类的子类，子类的子类...
//这些子类都有受影响有时我们又确实需要给父类增加一些方法，那么就不能直接在父类上下手，只能新建一个接口，在接口上拓展方法，
//其他需要的子类自行去实现接口

/**
 *  ----总结----
 *  抽象类是对一类事物的高度抽象，其中既有属性又有方法;接口是对方法的抽象，也就是对一系列动作的抽象
 */

public interface TestIn {
    int ID = 1;//等同于public static final int ID = 1;

    void test();//public abstract void test();

}
