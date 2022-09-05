package day07;

/**
 * @author lt
 * @data 7/14 - 8:24
 */
public class Person {
    int age;
    String name;
    int sex;

    public void showInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
    }

    public void setInfo(int age,String name,int sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

}

