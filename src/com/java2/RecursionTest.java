package com.java2;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author lt
 * @data 7/12 - 14:54
 */
/*
 * 递归方法的使用
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，他会重复执行某段代码，但是这种重复执行无需循环控制。
 * 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 *
 */
public class RecursionTest {

    public static void main(String[] args) {

        //例1.计算1-100之间所有自然数的和
        //方式一
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        //方式二:递归
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println(sum1);

        System.out.println("******************");
        int value = test.f(10);
        System.out.println(value);
    }

//例1.计算1-n之间所有自然数的和
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

//例2.计算1-n之间所有自然数的乘积：n！
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getSum1(n - 1);
        }
    }


//例3.已知有一个数列：f(0) = 1,f(1) = 4,f(n + 2) = 2 * f(n + 1) + f(n)
//其中n是大于0的整数，求f(10)的值
    public int f(int n){
        if (n == 0) {
            return 1;
        }else if(n == 1){
            return 4;
        }else{
//          return f(n + 2) - 2 * f(n + 1);
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}

//例4.输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
//1 1 2 3 5 8 13 21 34 55

//例5.汉诺塔

//例6.快排
