package day10;

/**
 * @author lt
 * @Description 抛出异常
 * @data 7/27 - 11:36
 */
//重写方法声明抛出异常的原则：子类重写父类的方法时，子类不能抛出比父类方法更大范围的异常
//eg：父类抛出NullPointerException异常，子类不能抛出Exception异常
public class Test1 {
    public static void main(String[] args) {//可以在main方法继续抛出异常
        //main方法抛出异常直接抛到虚拟机上去了，就在程序中不能处理
//        B b = new B();
//        try {
//            b.test();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        //人工抛出异常：Java异常类对象除再程序执行过程中出现异常时由系统自动生成并抛出，也可根据需要人工创建并抛出
        B b = new B();
        try {
//            b.test1(-100);//抛出Exception
            b.test2(-100);//抛出MyException
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class B {
    int i;

    //NullPointerException的父类是Exception
    public void test() throws NullPointerException {//可以使用throws在代码这抛出异常，在调用方去捕获处理
        B b = null;
        System.out.println(b.i);
    }

    int age;

    public void test1(int age) throws Exception {
        if (age >= 0 && age <= 150) {
            this.age = age;
            System.out.println("年龄是：" + this.age);
        } else {
            throw new Exception("年龄在0到150之间");
        }
    }

    public void test2(int age) throws MyException {
        if (age >= 0 && age <= 150) {
            this.age = age;
            System.out.println("年龄是：" + this.age);
        } else {
            throw new MyException("年龄在0到150之间");
        }
    }

    class C extends B {
        @Override
        public void test() throws NullPointerException {
//        public void test() throws Exception 重写方法不能抛出比被重写方法范围更大的异常类型

            super.test();
        }
    }

    //使用用户自定义异常类
    class MyException extends Exception {
        public MyException(String msg) {
            super(msg);//调用父类构造方法
        }
    }
}
//java提供的异常的类一般是够用的，只有特殊的情况可能需要自己编写异常类