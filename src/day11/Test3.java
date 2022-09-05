package day11;

/**
 * @author lt
 * @Description 枚举
 * @data 8/24 - 9:33
 */

/**
 * 枚举类概述
 * 再某些情况下，一个类的对象是有限而且固定的。例如季节类，只能有四个对象
 * 手动实现枚举类：
 *   · private修饰构造器
 *   · 属性使用private final修饰
 *   · 把该类的所有实例都使用public static final来修饰
 */

/**
 * 使用enum定义枚举类
 * · JDK1.5新增的enum关键字用于定义枚举类
 * · 枚举类和普通类的区别：
 *     · 使用enum定义的枚举类默认继承了java.lang.Enum类
 *     · 枚举类的构造器只能使用private访问控制符
 *     · 枚举类的所有实例必须在枚举类中显示列出(，分隔；结尾)。列出的实例系统会自动添加public static final修饰
 *     · 所有的枚举类都提供了一个values方法，该方法可以很方便地遍历所有的枚举值
 * · JDK1.5可以在switch表达式中使用枚举类的对象作为表达式，case子句可以直接使用枚举值的名字，无需添加枚举类作为限定
 * · 若枚举只有一个成员，则可以作为一种单例模式的实现方式
 */

/**
 * 实现接口的枚举类
 * · 和普通Java类一样枚举类可以实现一个或多个接口
 * · 若需要每个枚举值在调用实现的接口方法呈现处不同的行为方式，则可以让每个枚举值分别来实现该方法
 */
public class Test3 {
    public static void main(String[] args) {
        //Season.SPRING（枚举类名.枚举），这段执行就是获取一个Season的对象
        Season spring = Season.SPRING;
        spring.showInfo();

        Season spring1 = Season.SPRING;
        //每次执行Season.SPRING获得的是相同的对象，枚举类中的每个枚举都是单例模式
        System.out.println(spring.equals(spring1));//true
        spring1.test();
    }
}

enum Season implements ITest{
    SPRING("春天","春暖花开"),//相当于调用有参私有构造
    SUMMER("夏天","炎炎夏日"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","寒风凛冽");

    private final String name;
    private final String desc;

    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public void showInfo(){
        System.out.println(this.name + ":" + this.desc);
    }

    @Override
    public void test() {
        System.out.println("这是实现的ITest接口的test方法");
    }
}

interface ITest{
    void test();
}