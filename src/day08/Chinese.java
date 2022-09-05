package day08;

/**
 * @author lt
 * @Description 关键字static、类方法
 * @data 7/21 - 16:14
 */

/**
 * 关键字static
 * 如果想让一个类的所有实例共享数据，就用类变量！
 * 实例变量：（只有实例化之后才能使用，属于实例化对象的一部分，不能共用）String name; int age;
 * 类变量（静态变量）：
 *          （类变量不需要实例化，直接 类名.属性Chinese.country 就可以使用，是类的一部分，被所有这个类的实例化对象所共享）
 *           static String country;
 */
/*关键字static
使用范围：修饰属性、方法、代码块、内部类
被修饰后的成员具备以下特点：
随着类的加载而加载;
优先于对象存在;
修饰的成员，被所有对象所共享;
访问权限允许时，可不创建对象，直接被类调用
*/
public class Chinese {
    static String country;//希望有些属性不因为对象不同而改变，将这些属性设置为类属性
    String name;
    int age;

    public static void test(){//类方法(静态方法)：有些方法不想因为对象的不同而频繁通过new对象方式去调用方法，方法就写成static
        //类方法：因为不需要实例就可以访问static方法，因此static方法内部不能有this，也不能有super

        System.out.println("这是一个静态方法");

    }

}
