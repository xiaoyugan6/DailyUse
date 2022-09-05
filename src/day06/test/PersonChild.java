package day06.test;

import day06.Person4;
/*
 * 通过extends可以构成父子类的关系
 * PersonChild就是Person4的子类
 *
 */

/**
 * @author lt
 * @data 7/13 - 7:47
 */
public class PersonChild extends Person4 {
    public void test(){
        System.out.println(age);
        getAge();
    }
}
