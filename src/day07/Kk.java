package day07;

/**
 * @author lt
 * @Description super
 * @data 7/14 - 11:09
 */
/*
 * 关键字super
 * ·在java类中使用super来调用父类中的指定操作
 * >super可以用于访问父类中定义的属性
 * >super可以用于调用父类中定义的成员方法
 * >super可以用于在子类构造方法中调用父类的构造器
 *
 * ·注意：
 * >尤其当子父类出现同名成员时，可以用super进行区分
 * >super的追溯不仅限于直接父类
 * >super和this的用法相似，this代表本类对象的引用，super代表父类的内存空间的标识
 *
 */
public class Kk extends Kids{
    public void test(){
        super.salary = 1;//可以使用super向上追溯父类的父类，当然可以一直向上追溯，如果有多个层级的父类的话
        super.yearOld = 1;//可以使用super直接追溯使用父类的成员变量
        super.employed();//可以使用super直接追溯父类的成员方法
        super.manOrWoman();//可以使用super向上追溯父类的父类的成员方法，当然可以一直向上追溯，如果有多个层级的父类的话
    }
}
