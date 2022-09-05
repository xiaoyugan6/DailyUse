package day06;

/*
 *  * ·构造器的特征
 * >它具有与类相同的名称
 * >不能被static、final、synchronized、abstract、native修饰，不能有return语句返回值
 * ·构造器的作用：创建对象;给对象进行初始化
 * >如：Order o = new Order(); Person p = new Person(Peter,15);
 * >如同我们规定每个“人”一出生就必须先洗澡，我们就可以在“人”的构造方法中加入完成“洗澡”的程序代码，于是每个“人”一出生就会自动完成
 *  “洗澡”，程序就不必再在每个人刚出生时一个一个地告诉他们要“洗澡”了。
 *
 *  构造器
 * ·根据参数不同，构造器可以分为如下两类：
 * -> 隐式无参构造器(系统默认提供)
 * -> 显式定义一个或多个构造器(无参、有参)
 *
 * ·注意
 * -> Java语言中，每个类都至少有一个构造器
 * -> 默认构造器的修饰符与所属类的修饰符一致
 * -> 一旦显式定义了构造器，则系统不在提供默认构造器
 * -> 一个类可以创建多个构造器
 * -> 父类的构造器不可被子类继承
 *
 * **new对象实际上就是调用类的构造方法**
 *
 * 构造器也叫构造方法，既然是方法，就可以重载
 * ·构造器一般用来创建对象的同时初始化对象。
 * ·构造器的重载，就是为了方便调用方可以灵活的创建出不同需要的对象。
 * ·重载的多个构造方法实际上就是相当于提供了多个初始化new对象的模板。
 * ·构造器重载，参数列表必须不同。
 */

/**
 * @author lt
 * @data 7/13 - 8:53
 */
public class Person5 {
    /**
     * 如果显示的定义了构造方法，那么就会使用显示的构造方法
     */
    //在new Person5()的过程中，直接给age和name给一个默认值
//    public Person5(){
//        age = 1;
//        name = "zhangsan";
//    }

    /**
     * 可以写带参数的构造方法
     * @param a
     * @param n
     */
    public Person5(int a,String n){
        age = a;
        name = n;
    }
    public int age;
    public String name;
    public void showInfo(){
        System.out.println(age);
        System.out.println(name);
    }
}
