package day09;

/**
 * @author lt
 * @Description 抽象类
 * @data 7/25 - 17:05
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * abstract修饰的类叫抽象类，abstract修饰的方法叫抽象方法
 * 抽象方法：只有方法的声明，没有方法的实现。以分号结束：abstract int abstractMethod(int a);
 * 含有抽象方法的类必须声明为抽象类
 * 抽象类不能被实例化。抽象类是用来作为父类被继承的，抽象类的子类必须重写父类的抽象方法，并提供方法体。
 * 若没有重写全部的抽象方法，仍为抽象类。
 * 不能用abstract修饰属性、私有方法、构造器、静态方法、final的方法。
 */

/**
 * 抽象类是用来模型化那些父类无法确定全部实现，而是由其子类提供具体实现的对象的类。
 * 在航运公司系统中，Vehicle类需要定义两个方法分别计算运输工具的燃料效率和行驶距离。
 * 卡车和驳船的燃料效率和行驶距离的计算方式完全不同。Vehicle类不能提供方法，但子类可以。
 */
public abstract class Animal {
    public abstract void test();//只要类中有一个是抽象的方法，那么这个就必须是一个抽象类

    public abstract void move();
}

class Dog extends Animal{
    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("狗的移动方式是跑");
    }
}

class Fish extends Animal{
    @Override
    public void test() {

    }

    @Override
    public void move() {
        System.out.println("鱼的移动方式是游");
    }
}

abstract class Bird extends Animal{//抽象类可以继承抽象类
    @Override
    public void move() {

    }

    public abstract void test();
}
