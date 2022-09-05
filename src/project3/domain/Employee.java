package project3.domain;

/**
 * @author lt
 * @Description Employee(员工)类及其子类的设计
 * @data 8/1 - 15:15
 */

/**
 * Employee
 * - i:int
 * - name:String
 * - age:int
 * - salary:double
 * + Employee(id:int,name:String,age:int,salary:double)
 */

/**
 * · 说明：
 * > domain模块中包含了所有实体类
 * > 继承关系为：Employee ⬅ Programmer ⬅ Designer ⬅ Architect
 * · 其中程序员(Programmer)及其子类，均会领用某种电子设备(Equipment)
 * · 可根据需要为类提供各属性的get/set方法以及重载构造器
 */

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super();
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getDetails(){
        return id + "\t" + name + "\t" + age + "\t\t" + salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }

}
