package day06;

/**
 * @author lt
 * @data 7/13 - 9:42
 */
//练习5
//在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
// 修改上题中类和构造器，增加name属性，使得每次创建Person对象的同时初始化对象的age属性值和name属性值
public class Person6 {
    public Person6(){

    }

    public Person6(int a){

    }

    public Person6(String n){

    }

    public Person6(int a,String n){
//      age = 18;
        age = a;
        name = n;
    }
    public int age;
    public String name;
}
