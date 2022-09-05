package day08;

/**
 * @author lt
 * @Description 静态方法常用于工具类
 * @data 7/22 - 16:08
 */

public class Utils {
    //判断字符串是不是一个空字符串
    public static boolean isEmpty(String s){
        boolean flag = false;
        if(s != null && !s.equals("")){
            flag = true;
        //未来的开发种可能会多次使用这样的判断，在大量次数的基础上看，发现代码的重复很多，
        // 所以我们把这样的代码给抽取到工具类做成一个方法
        }
        return flag;

    }



}
