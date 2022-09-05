package day09;

/**
 * @author lt
 * @Description 内部类
 * @data 7/25 - 9:44
 */

/**
 * 内部类特性
 * Inner class作为类的成员：
 * 可以声明为final的
 * 和外部类不同，Inner class可声明为private或protected;
 * Inner class可以声明为static的，但此时就不能再使用外层类的非static的成员变量;
 * Inner class作为类：
 * 可以声明为abstract类，因此可以被其他的内部类继承
 *【注意】非static的内部类中的成员不能声明为static的，只有在外部类或static的内部类才可声明static成员
 */
//内部类有什么用？内部类主要是解决java不能多重继承的问题

public class Test3 {
    int i;
    public int z;
    private int k;
    class A{
        int i;
        public void setTest3Files(){
            Test3.this.i = 1;//不能直接使用this.
            Test3.this.z = 2;
            Test3.this.k = 3;
        }
//如果内部类是static的，就不能使用外部类的非static的成员变量
        final class B{

        }
        private class C{

        }
        protected class D{

        }
        abstract class E{

        }
         class F extends E{

        }
        public void set(){
            this.i = 10;
        }
    }

    public void setInfo(){
        new A().setTest3Files();//外部的类要用自己的内部类的方法，得先new内部类的对象
    }

    public void showInfo(){
        System.out.println(this.i);
        System.out.println(this.z);
        System.out.println(this.k);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.setInfo();
        t.showInfo();
    }
}
