package project2.bean;
/**
 * @Description Customer为实体对象，用来封装客户信息
 * @author lt
 * @data 7/15 - 16:12
 */

/**
 * 该类封装客户的以下信息：
 * String name;客户姓名
 * char gender;性别
 * int age;年龄
 * String phone;电话号码
 * String email;电子邮箱
 */
//提供各属性的get/set方法
//提供所需的构造器(可自行确定)

//MVC设计模式
/*
 * 模型层 主要处理数据
 * >数据对象封装 model.bean/domain
 * >数据库操作类 model.dao
 * >数据库 model.db
 *
 * 控制层 controller 处理业务逻辑
 * >应用界相关 controller.activity
 * >存放fragment controller.fragment
 * >显示列表的适配器 controller.adapter
 * >服务相关的 controller.service
 * >抽取的基类 controller.base
 *
 * 视图层 view 显示数据
 * >相关工具类 view.utils
 * >自定义view view.ui
 */

public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    //alt + insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //通常写构造器时候都习惯上先提供一个空参的
    public Customer() {
    }

    //格式化源代码 Ctrl + Alt + L
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
