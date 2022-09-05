package day10;

/**
 * @author lt
 * @Description 异常、捕获异常（try{}catch(){}）
 * @data 7/27 - 10:14
 */

/**
 * Throwable → Error → VirtualMachineError → StackOverFlowError
 *                                         → OutOfMemoryError
 *                   → AWTError
 *
 *
 *                       → IOException → EOFException
 *                                     → FileNotFoundException
 *           → Exception
 *
 *                       → RuntimeException → ArithmeticException
 *                                          → MissingResourceException
 *                                          → ClassNotFoundException
 *                                          → NullPointerException
 *                                          → IllegalArgumentException
 *                                          → ArrayIndexOutOfBoundsException
 *                                          → UnknownTypeException
 */
public class Test {
    public static void main(String[] args) {
        String[] strs = new String[]{"a","b","c"};

        for(int i = 0;i < 3;i++){//i < 4; java.lang.ArrayIndexOutOfBoundsException 数组越界异常
            System.out.println(strs[i]);
        }

        A a = new A();//A a = null; java.lang.NullPointerException 空指针异常
        System.out.println(a.i);

        int b = 0;
        try {//用try{}来括住一段有可能出现异常的代码段
            System.out.println(1);
            System.out.println(3 / b);//java.lang.ArithmeticException 算术异常
            System.out.println(2);
            //由于异常，使中断，可以通过异常处理机制防止程序的中断
        }catch(Exception e){//当不知道捕获的是什么类型的异常时，可以直接使用所有异常的父类Exception
            e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
            System.out.println(e.getMessage());//得到异常信息
            System.out.println(3);
        }finally{//可以写也可以不写，它是捕获异常的体系中最终一定会执行的部分，未来学习IO操作和JDBC都会接触
            System.out.println(4);//输出134
        }

        System.out.println("ok");

        //catch可以捕获多个异常
        String[] strs1 = new String[]{"a","b"};
        A c = null;
        //try catch为了防止程序可能出现的异常
        //在捕获异常的代码块中（try()里的代码），如果前面的代码有异常了，就不会执行后面的
        try {
            System.out.println(strs1[2]);
            System.out.println(c.i);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }catch(NullPointerException e2){
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        }
        System.out.println("=====");
    }

}

class A{
    int i;
}