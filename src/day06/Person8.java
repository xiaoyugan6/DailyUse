package day06;

import jdk.jfr.DataAmount;

/**
 * @author lt
 * @data 7/13 - 16:00
 */

/*
 *
 *
 * ·JavaBean是一种Java语言写成的可重用组件。
 *
 * ·所谓javaBean，是指符合如下标准的Java类：
 * ->类是公共的
 * ->有一个无参的公共构造器
 * ->私有属性，且有对应的get、set方法
 *
 * ·用户可以使用JavaBean将功能、处理、值、数据库访问和其他任何可以用java代码创造的对象进行打包，并且其他的开发者可以通过内部的JSP
 *  页面、Servlet、其他JavaBean、applet程序或者应用来使用这些对象。用户可以认为JavaBean提供了一种随时随地的复制和粘贴的功能，
 *  而不关心任何改变。
 *
 */
public class Person8 {

    private String name;
    private int sex;//性别：0男
    private int age;

    // *********getter和setter方法自动生成快捷键：alt + insert*********
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
