package day08;

/**
 * @author lt
 * @Description 理解main方法的语法
 * @data 7/25 - 9:29
 */

/**
 * 1.cmd
 * 2.d:
 * 3.javac TestMain.java
 * 4.java TestMain abc 123 jkl sss
 */
/**
 * 4.abc 123 jkl sss转换为String[] args数组
 *     {
 *         "adc"
 *         "123"
 *         "jkl"
 *         "sss"
 *     }
 */

public class TestMain {
    public static void main(String[] args) {
        for(int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
    }
}
