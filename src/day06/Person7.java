package day06;

/**
 * @author lt
 * @data 7/13 - 14:43
 */
/*
 * this关键字
 * ->它在方法内部使用，即这个方法所属对象的引用。
 * ->它在构造器内部使用，表示该构造器正在初始化的对象。
 * ·this表示当前对象，可以调用类的属性、方法和构造器
 * ·什么时候使用this关键字呢？
 * ->当在方法内需要用到调用该方法的对象时，就用this。
 *
 * 1.当形参与成员变量重名时，如果在方法内部需要使用成员变量时，必须添加this来表示该变量时类成员。
 * 2.在任意方法内，如果使用当前类的成员变量或成员方法可以在其前面添加this，增强程序的阅读性。
 * 3.this可以作为一个类中，构造器互相调用的特殊格式
 *
 * 注意：
 * 1.使用this()必须放在构造器的首行！
 * 2.使用this调用本类中其他的构造器，保证至少有一个构造器是不用this的(实际上就是不能出现构造器自己调用自己)。
 */
public class Person7 {
    public Person7(){

    }

    public Person7(int age){
        this.age = age;
    }

    public  Person7(String name){
        this();//等同于调用public Person7()
        this.name = name;
    }

    public Person7(int age,String name){
        this(1);//等同与调用public Person7(int age)
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

    public void setName(String name){
        this.name = name;
    }

    public void setName1(String name){
        this.setName(name);
    }

    public void showInfo(){
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
    }

}
