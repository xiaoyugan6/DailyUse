package day08;

import sun.util.resources.cldr.sw.CurrencyNames_sw;

/**
 * @author lt
 * @Description
 * @data 7/19 - 16:47
 */
//对象类型转换(Casting)

// ·基本数据类型的Casting：
// >自动类型转换：小的数据类型可以自动转换成大的数据类型;如long g = 20;    double d = 12.0f;
// >强制类型转换：可以把大的数据类型强制转换(casting)成小的数据类型;如float f = (float)12.0;    int a = (int)1200L;

// ·对Java对象的强制类型转换称为造型
// >从子类到父类的类型转换可以自动进行
// >从父类到子类的类型转换必须通过造型(强制类型转换)实现
// >无继承关系的引用类型间的转换是非法的

public class Test {
    public static void main(String[] args) {
//        int i = 10;
//        long l = i;

//        long l = 10l;
//        int i = (int) l;

//        Student s = new Student();
//        Person p = s;//子到父自动转换

//        Person p = new Person();
//        Student s = (Student) p;//父到子强制转换

//        Test t = new Test();
//        Person p1 = t;错误

        //Object是所有类的最高父类

//        String s = "Hello";
//        Object obj = s;//子到父
//        System.out.println(obj);

//        Object obj = "hello";
//        String s = (String) obj;//父到子强制转换

//        Test t = new Test();
//
//        t.method(new Person());
//        t.method(new Student());

        //基本类型比较：只要两个变量的值相等，即为true
//        int i = 3;
//        System.out.println(i == 4);

        //引用类型比较引用(是否指向同一个对象);只有指向同一个对象时，==才返回true。
//        Person p1 = new Person();
//        Person p2 = p1;
//        Test t = new Test();
//        System.out.println(p1 == p2);//true
//        System.out.println(p1.equals(p2));//equals只能比较引用类型，其作用与"=="相同，比较是否指向同一个对象。
        //用==进行比较时，符号两边的数据类型必须兼容(可自动转换的基本数据类型除外)，否则编译出错;
//        System.out.println(p1 == t);报错

//        String s1 = new String("abc");
//        String s2 = new String("abc");

//        System.out.println(s1 == s2);//false
        //当用equals()方法进行比较时，对类File、String、Data及包装类(Wrapper Class)来说，是比较类型及内容而不考虑引用的是否是
        // 同一个对象
//        System.out.println(s1.equals(s2));//true
/**
 * 总结：
 * 对于对象来说
 * 特殊的类，如String、File、Data，使用==比较的是对象（对象的地址）
 * equals比较的内容：
 * 除了特殊的类之外的其他普通的类的对象，==和equals比较的都是对象（对象的内存地址）
 * 如果你想改变某一个类的equals，不想用equals来比较对象的内存地址（比较值），就需要重写equals方法
 */

//        Order o1 = new Order(123,"a001");
//        Order o2 = new Order(123,"a002");
//
//        System.out.println(o1.equals(o2));

//        MyData m1 = new MyData(2030,11,23);
//        MyData m2 = new MyData(2030,11,23);
//        System.out.println(m1.equals(m2));

//        Integer i = new Integer(112);
//        int i0 = i.intValue();

//        Integer i = new Integer(112);
//        int i0 = i.intValue();
//        System.out.println(i0);//拆箱

//        Integer i1 = 112;//自动装箱
//        int i2 = i1;//自动拆箱
//
//        boolean b = new Boolean("false");//自动拆箱
//        Boolean b1 = true;//自动装箱
//        System.out.println(b);

        int i = Integer.parseInt("123");//字符串转换为基本数据类型
        float f = Float.parseFloat("0.40");
        boolean b = Boolean.parseBoolean("false");

        String istr = String.valueOf(i);//基本数据类型转换为字符串
        String fstr = String.valueOf(f);
        String bstr = String.valueOf(false);

        MyData m = new MyData(2030,12,12);
        System.out.println(m.toString());//重写前：@6bc7c054    重写后：2030-12-12
        System.out.println(m);//@6bc7c054，打印m对象相当于执行打印m.toString(),这个在其他对象也如此

        Chinese.country = "中国";
        Chinese c = new Chinese();
//        c.country = "中国";
        c.name = "Xx";
        c.age = 11;
        Chinese c1 = new Chinese();
//        c1.country = "中国";
        //使用static，让所有的对象都使用一个相同的国籍

        Chinese.test();//静态方法

        String s = "11";
        System.out.println(Utils.isEmpty(s));//静态方法

        Single s1 = Single.getInstance();//饿汉式：无论执行多少次代码都调用Single.getInstance()，
        // 返回的是Single(私有的类变量)，私有类变量在整个代码运行过程中只有一份，只new了一次
        Single1 s2 = Single1.getInstance();//懒汉式：无论后面多少个，都取得的是第一个new的Single1对象

    }

    public void method(Person e) {
        if (e instanceof Student) {
            Student s = (Student) e;
            s.getSchool();
        } else {
            e.test();
        }
    }

}
