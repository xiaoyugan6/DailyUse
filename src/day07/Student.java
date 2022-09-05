package day07;

/**
 * @author lt
 * @data 7/14 - 8:39
 */

/*
 * 继承的作用：
 * ->继承的出现提高了代码的复用性。
 * ->继承的出现让类与类之间产生了关系，提供了多态的前提。
 * ->不要仅为了获取其他类中某个功能而去继承。
 *
 * Java只支持单继承，，不允许多重继承
 * ->一个子类只能有一个父类
 * ->一个父类可以有多个子类
 *
 * 方法的重写(override)
 * ·定义：在子类中可以根据需要对从父类中继承的方法进行改造，也称方法的重置、覆盖。在执行程序时，子类的方法将覆盖父类的方法。
 * ·要求：
 * >重写方法必须和被重写方法具有相同的方法名称、参数列表和返回值类型
 * >重写和被重写的方法必须同时为static的，或者同时为非static的
 * >子类方法抛出的异常不能大于父类被重写方法的异常
 *
 * 方法的重载：一个类可以有多个多个同名方法
 * 方法的重写：子类可以重新写父类的方法，覆盖父类的方法
 *
 * 多层继承
 * 使用super，子类可以调用子类之上的所有父类层级
 * 处于最高层的父类一定是Object类
 */
public class Student extends Person{
    String school;

//    public void showInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.sex);
//        System.out.println(this.school);
//    }

//**********idea重写快捷键 ctrl + o**************
    @Override
    public void showInfo() {
        System.out.println("以下是student类对Person类的showInfo方法的重写");
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
    }

//    @Override
//    public void setInfo(int age, String name, int sex) {
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(sex);
//    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.showInfo();
        Student s = new Student();
        Person p = new Person();
        System.out.println(s instanceof Person);//true
        System.out.println(p instanceof Person);//true

        System.out.println(p instanceof Student);//false

        Person e = new Student();

        System.out.println(e instanceof Student);//true
        //x instanceof A:检验x是否为类A的对象，返回值为boolean
        //就是检验某个对象是不是类A的子类
    }
}
