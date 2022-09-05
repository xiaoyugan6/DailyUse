package day09;

/**
 * @author lt
 * @Description
 * @data 7/25 - 15:03
 */
public class Test {
    public static void main(String[] args) {
        new Person();//先执行的是代码块123，再执行的是构造
        new Person();//在程序的运行过程中，非静态代码块，每次new对象都要重新执行。静态代码块只执行一次

        //匿名内部类
        Person p = new Person(){
            @Override
            public void test() {
                System.out.println("====");//构建了一个没有类名的Person子类也就是匿名的Person的子类
//没有匿名就不能显示的new的方法创建对象，如果要是还要在构造器中初始化属性就没有办法了，这样情况就要用代码块做初始化的工作
            }
        };
        System.out.println(p.name);

        Dog d = new Dog();
        d.move();

        CommonEmployee ce = new CommonEmployee();
        ce.work();
        ce.setCommEmployeeInfo(123,"张三",6354.31);
        ce.getCommonEmployeeInfo();

        Template t = new TestTmp();
        t.getTime();

        Test1Child tc = new Test1Child();

        SCTeacher sct = new SCTeacher();
        sct.setInfo();
        sct.showInfo();
        sct.fry();
        sct.singing();

        //对象的多态
        Cooking c = new SCTeacher();//可以用接口来接收一个new对象
        c.fry();//只能访问当前接口里的方法
        Sing s = new SCTeacher();
        s.singing();
    }
}
