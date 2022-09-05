package day06;
class T1{
    //默认构造方法
    T1(){}
        }
/* Java权限修饰符public、protected、private置于类的成员定义前，用来限定对象对该类成员的访问权限
 *
 * 修饰符    内部类    同一个包    子类    任何地方
 * private   Yes
 * (缺省)    Yes      Yes
 * protected Yes      Yes        Yes
 * public    Yes      Yes        Yes     Yes
 *
 * 对于class的权限修饰只可以用public和default(缺省)
 * public类可以在任何地方被访问
 * default类只可以被同一个包的内部的类访问
 *
 * **如果子类和父类在同一个包下，那么对于父类的成员修饰符只要不是私有的private，那子类就都可以使用**
 * **如果子类和父类不在同一个包下，子类只能使用父类中protected和public修饰的成员**
 *
 */

/**
 * @author lt
 * @data 7/13 - 7:39
 */

public class Person4 {
    //默认的构造方法前面有没有访问的修饰符跟定义的类有关，类是public的，默认的构造就是public，
    // 默认的类是缺省的，它的构造方法就是缺省的;

    //1.private的情况
//    private int age;
//
//    private void getAge(){
//
//        System.out.println(age);
//    }
//
//
//    public void test(){
//        getAge();
//    }
//}

    //2.缺省的情况
//int age;
//
//public void getAge(){
//    System.out.println(age);
//}
//
//public void test(){
//    getAge();
//}
//}

    //3.protected的情况
//protected int age;
//
//public void getAge(){
//    System.out.println(age);
//}
//
//public void test(){
//    getAge();
//}
//}

    //4.public的情况
public int age;

public void getAge(){

    System.out.println(age);
}

public void test(){
    getAge();
}

}