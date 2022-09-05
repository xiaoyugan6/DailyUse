package Array;

/**
 * @author lt
 * @data 5/6 - 16:33
 */
public class ArrayTest1 {
    public static void main(String[] args) {
/*
 *  二维数组的使用：
 *  规定：二维数组分为外层数组的元素，内层数组的元素
 *      int[][] arr = new int[4][3];
 *      外层元素:arr[0]..
 *      内层元素:arr[0][0]..
 *
 *  ⑤数组元素的默认初始化值
 *  针对于初始化方式一：比如int[][] arr = new int[4][3];
 *      外层元素的初始化值：地址值
 *      内层元素的初始化值：与一维数组初始化情况相同
 *
 *  针对于初始化方式二：比如int[][] arr = new int[4][];
 *      外层元素的初始化值：null
 *      内层元素的初始化值：不能调用，否者报错
 *
 */


        //⑥数组的内存解析
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//[I@15db9742
        //[代表一维、I代表int、15bd9742为16进制地址
        System.out.println(arr[0][0]);//0
        System.out.println(arr);//[[I@6d06d69c

        float[][] arr1 = new float[4][3];
        System.out.println(arr1[0]);//[[F@6d06d69c
        System.out.println(arr1[0][0]);//0.0

        String[][] arr2 = new String[4][2];
        System.out.println(arr2[1]);//[Ljava.lang.String;@7d4991ad
        System.out.println(arr2[1][1]);//null

        double[][] arr3 = new double[4][];
        System.out.println(arr3[1]);//null
        System.out.println(arr3[1][0]);//报错
    }
}


