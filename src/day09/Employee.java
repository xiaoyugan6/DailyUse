package day09;

/**
 * @author lt
 * @Description 练习
 * @data 7/26 - 8:41
 */

/**
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。提供必要的构造器和抽象方法：work()。
 * 对于继承Manage类来说，他既是员工，还具有奖金(bonus)的属性。请使用继承的思想，设计CommonEmployee类和Manage类，
 * 要求类中提供必要的方法进行属性访问。
 */
public abstract class Employee {
    public Employee(){

    }
    int id;
    String name;
    double salary;

    public abstract void work();
}

class CommonEmployee extends Employee{

    public void setCommEmployeeInfo(int id,String name,double salary){
        super.id = id;//super访问父类属性
        super.name = name;
        super.salary = salary;
    }

    public void getCommonEmployeeInfo(){
        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(super.salary);
    }

    @Override
    public void work() {
        System.out.println("这是一个普通员工");
    }
}

class Manage extends Employee{
    double bonus;

    public void setManageInfo(int id,String name,double salary){
        super.id = id;
        super.name = name;
        super.salary = salary;
        this.bonus = bonus;//自己的属性
    }

    public void getManageInfo(){
        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(super.salary);
        System.out.println(this.bonus);
    }

    @Override
    public void work() {
        System.out.println("这是一个领导");
    }
}