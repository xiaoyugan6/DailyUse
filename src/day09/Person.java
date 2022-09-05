package day09;

/**
 * @author lt
 * @Description (非)静态代码块(初始化块)
 * @data 7/25 - 15:00
 */

/**
 * 在new Person();执行的时候
 * 1.类的属性的默认初始化和显示初始化
 * 2.执行代码块1、2、3的代码
 * 3.执行构造器的代码
 */

/**
 * 非静态代码块：没有static修饰的代码块
 * 1.可以有输出语句
 * 2.可以对类的属性声明进行初始化操作
 * 3.可以调用静态和非静态的变量和方法
 * 4.若有多个非静态的代码块，那么按照从上到下的顺序一次执行。
 * 5.每次创建对象的时候，都会执行一次。且先于构造器
 */

/**
 * 静态代码块：用static修饰的代码块
 * 1.同上
 * 2.同上
 * 3.不可以对非静态的属性初始化。即：不可以调用非静态的属性和方法
 * 4.同上
 * 5.静态代码块的执行优先于非静态代码块
 * 6.静态代码块只执行一次
 */
//在实际开发中，static静态代码块用在初始化类的静态属性
public class Person {
    String name;
    static int age;
    static TestPerson tp = new TestPerson();

    public Person(){
        this.name = "张三";
        System.out.println("执行的是构造方法");
    }

    //这是一个非静态的代码块
    {
        System.out.println("执行的是非静态的代码块1");

    }

    {
        System.out.println("执行的是非静态的代码块2");
    }

    {
        System.out.println("执行的是非静态的代码块3");
    }

    //静态代码块
    static {
        //这里只能使用静态修饰的属性和方法
        age = 1;
        showAge();
        System.out.println("===执行的是静态代码块===");
        tp.name = "";
        tp.age = 1;
    }

    public static void showAge(){
        System.out.println(age);
    }

    public void test(){
        System.out.println("Person的test方法");
    }

}
