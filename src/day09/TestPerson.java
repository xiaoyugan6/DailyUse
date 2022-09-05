package day09;

/**
 * @author lt
 * @Description final
 * @data 7/25 - 15:57
 */

/**
 * 1.final标记的类不能被继承
 * 2.final标记的方法不能被子类重写
 * 3.final标记的变量（成员变量或局部变量）即成为常量。名称大写，如果多个单词组成名称，用_连接，且只能被赋值一次
 * final标记的成员变量必须在声明的同时或在每个构造方法中或代码块中显式赋值，然后才能使用
 */
public final class TestPerson {
    int age;
    String name;//final static一起修饰变量，就是全局常量
}

