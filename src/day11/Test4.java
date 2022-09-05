package day11;

/**
 * @author lt
 * @Description Annotation(注解)概述
 * @data 8/24 - 16:09
 */

/**
 * Annotation(注解)概述
 * · 从JDK5.0开始，Java增加了对元数据（MetaDate）的支持，也就是Annotation（注释）
 * · Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。
 *   通过使用Annotation，程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息。
 * · Annotation可以像修饰符一样被使用，可用于修饰包，类，构造器，方法，成员变量，参数，局部变量的声明，
 *   这些信息被保存在Annotation的 "name = value"键值对中
 * · Annotation能被用来为程序元素（类，方法，成员变量等）设置元数据
 */

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 基本的Annotation
 * · 使用Annotation时要在其前面增加@符号，并把该Annotation当成一个修饰符使用。用于修饰它支持的程序元素
 * · 三个基本的Annotation：
 *     · @Override：限定重写父类方法，该注释只能用于方法
 *     · @Deprecated：用于表示某个程序元素（类，方法等）已过时
 *     · @SuppressWarning：抑制编译器警告
 */
public class Test4 {
    public static void main(String[] args) {
        new TestB().test1();

        //抑制警告
        @SuppressWarnings({"rawtypes","unused"})
        List list = new ArrayList();
    }
}

class TestA{
    public void test(){

    }
}

class TestB extends TestA{

    @TestAnn(id = 100,desc = "姓名")
    String name;

    //重写快捷键： ctrl + o
    @Override
    public void test() {
        super.test();
    }

    //过时方法
    @Deprecated
    public void test1(){

    }

}

//自定义注解
@Target(ElementType.FIELD)//此注解类只能给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的生命周期
@Documented
@interface TestAnn{
    public int id() default 0;

    public String desc() default  "";
}