package day06;
/* 封装和隐藏
 * Java中通过将数据声明为私有的(private)，再提供公共的(public)方法：getXxx()和setXxx()实现对该属性的操作，以实现下述目的：
 * 隐藏一个类中不需要对外提供的实现细节;
 * 使用者只能通过实现定制好的方法来访问数据，可以方便地加入控制逻辑，限制对属性的不合理操作;
 * 便于修改，增强代码的可维护性;
 */
/**
 * @author lt
 * @data 7/12 - 21:51
 */
public class Person {
    //public int age;
    // 像这种情况，是把类的属性开发出来，让调用者随意使用，这样会有问题

    //我们需要对这样不能让调用者随意使用的属性做封装和隐藏
    private int age;

    public void printAge() {
        System.out.println("年龄是" + age);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a) {
        if (a <= 150 && a >= 0) {
            age = a;
        } else {
            System.out.println("输入的年龄：" + a + "不在0到150之间");
        }
    }
}

