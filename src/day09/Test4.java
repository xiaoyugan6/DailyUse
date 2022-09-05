package day09;

/**
 * @author lt
 * @Description 例子：内部类解决java不能多重继承的问题
 * @data 7/25 - 11:31
 */
public class Test4 {
    public static void main(String[] args) {
        A a = new A();
        a.testB();
        a.testC();
    }

}

/**
 * 类A想要同时获得类B和类C的方法，并且重写
 * 可以使用内部类来变相的实现类的多重继承，可以同时继承多个类
 */
class A{
    public void testB(){
        new InnerB().testB();
    }

    public void testC(){
        new InnerC().testC();
    }

    private class InnerB extends B{
        @Override
        public void testB() {
            System.out.println("这是重写之后的testB方法");
        }
    }
    private class InnerC extends C{
        @Override
        public void testC() {
            System.out.println("这是重写之后的testC方法");
        }
    }
}

class B{
    public void testB(){

    }
}

class C{
    public void testC(){

    }
}
