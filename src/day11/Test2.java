package day11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lt
 * @Description 通配符：？
 * @data 8/23 - 11:02
 */

/**
 * 不确定集合中的元素具体的数据类型
 * 使用？表示所有类型
 */

/**
 * 有限制的通配符
 * 举例：
 * <？extends Person> (无穷小,Person]
 * 只允许泛型为Person及Person子类的引用调用
 *
 * <？super Person> [Person,无穷大）
 * 只允许泛型为Person及Person父类的引用调用
 *
 * <？extends Comparable>
 * 只允许泛型为实现Comparable接口的实现类的引用调用
 */
public class Test2 {
    public static void main(String[] args) {
        Dd d = new Dd();
        List<String> l1 = new ArrayList<String>();
        d.test(l1);

        List<Integer> l2 = new ArrayList<Integer>();
        d.test(l2);

        List<C1> lc = new ArrayList<C1>();
        d.test1(lc);

        List<D1> ld = new ArrayList<D1>();
        d.test1(ld);

//        List<B3> lb = new ArrayList<B3>();
//        d.test1(lb);

        d.test2(lc);

        List<A1> la = new ArrayList<A1>();
        d.test2(la);
        List<IAImpl> lia = new ArrayList<IAImpl>();
        d.test3(lia);

//        d.test3(la);
    }
}

class Dd {
    public void test(List<?> list) {

    }//test方法需要一个list集合的参数，不确定list集合中存的数据类型是什么

    public void test1(List<? extends C1> list) {//list参数的元素数据类型是C1及其子类(C1、D1)
    }

    public void test2(List<? super C1> list) {//list参数的元素数据类型是C1及其父类(C2、B3、A1)
    }

    public void test3(List<? extends IA> list) {//list参数的元素数据类型是IA的实现类
    }
}

class A1{}

class B3 extends A1{}

class C1 extends B3{}

class D1 extends C1{}

interface IA{}

class IAImpl implements IA{}



