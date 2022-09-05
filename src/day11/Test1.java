package day11;

/**
 * @author lt
 * @Description 泛型接口、泛型方法
 * @data 8/22 - 15:07
 */

//定义一个泛型接口
//interface Generator<T>{T next();}

public class Test1 {
    public static void main(String[] args) {
        B1<Object> b1 = new B1<Object>();
        B1<String> b2 = new B1<String>();

        B2 b3 = new B2();//不用指定泛型

        Cc<Object> c = new Cc<Object>();
        c.test("xxx");
        //泛型方法，在调用之前没有固定的数据类型。在调用时，传入的参数是什么类型，就会把泛型改成什么类型
        //也就是说，泛型方法在调用时确定泛型具体数据类型
        Integer i = c.test1(2);
        Boolean b = c.test1(true);
    }
}

interface IB<T>{
    T test(T t);
}

//未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
class B1<T> implements IB<T>{

    @Override
    public T test(T t) {
        return t;
    }
}

//如果实现接口时指定接口的泛型的具体数据类型，这个类实现接口所有方法的位置都要将泛型替换成实际的具体数据类型
class B2 implements IB<String>{

    @Override
    public String test(String s) {
        return null;
    }
}

class Cc<E>{
    private E e;

    //静态方法的泛型方法
    public static <T> void test3(T t){
        //在静态方法中，不能使用类定义的泛型，如果要使用泛型，只能使用静态方法自己定义的泛型
//        System.out.println(this.e);
        System.out.println(t);
    }



    //无返回值的泛型方法
    public <T> void test(T s){
        //在类上定义的泛型，可以在普通的方法中使用
        System.out.println(this.e);
        T t = s;
    }

    //有返回值的泛型方法
    public <T> T test1(T s){
        return s;
    }

    //形参为可变参数的泛型方法
    public <T> void test2(T... strs){
        for(T s : strs){//foreach循环语句
            System.out.println(s);
        }
    }

}