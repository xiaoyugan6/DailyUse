package day07;

/**
 * @author lt
 * @data 7/15 - 9:44
 */

//****简单类对象的实例化过程****

//public class Person(){
//    public Person(){
//
//    }
//
//    int age = 1;
//    String name = "zhangsan";
//    int sex = 0;
//
//    public void ShowInfo(){
//        System.out.println(this.age);
//        System.out.println(this.name);
//        System.out.println(this.sex);
//    }
//
//    public void setInfo(int age,String name,int sex){
//        this.age = age;
//        this.name = name;
//        this.sex = sex;
//    }
//}
/*
 *
 * 1.方法区：加载Person.class
 * 2.栈内存：在栈中申请空间，声明变量p
 * 3.堆内存：在堆内存中开辟空间，分配地址，假设地址是BE2500
 * 4.堆内存：对对象中的属性进行默认初始化，此时age=0；name=null，sex=0，类成员变量显示初始化，此时age=1，name="zhangsan"，
 *   sex=0
 * 5.栈内存：构造函数方法进栈，进行初始化
 * 6.栈内存：初始化完毕后，将堆内存中的地址值赋给引用变量，构造方法出栈
 */
//*************************************

//****子类对象的实例化过程****

//public class Person {
//    public Person() {
//    }
//
//    int age = 1;
//    String name = "zhangsan";
//    int sex = 0;
//}
//
//public class Student extends Person{
//    public Student(){
//        super();执行父类构造方法
//    }
//    String school;
//
//}
/*
 * 1.方法区：先加载Person.class，再Student.class（先加载父类，再加载子类）
 * 2.栈内存：在栈中申请对象，声明变量stu,假设地址是BE3500（Student stu = new Student();）
 * 3.堆内存：在堆内存中开辟空间，分配地址(给new Student)。假设地址是BE3500
 * 4.堆内存：并在对象空间中，对对象中的属性(包括父类的属性)进行默认初始化。此时age、sex都是0，name和school都是null
 * 5.栈内存：子类构造方法进栈
 * 6.堆内存：显示初始化父类的属性
 * 7.栈内存：父类构造方法进栈，执行完毕出栈
 * 8.堆内存：显示初始化子类的属性(本例中子类的属性没有赋值，所以显示初始化就省略了)
 * 9.栈内存：初始化完毕后，将堆内存中的地址值(new Student)赋给引用变量(stu)。子类构造方法出栈
 */




public class Instantiate {
}
