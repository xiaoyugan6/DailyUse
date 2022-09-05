package Array;

import java.util.Scanner;

/**
 * @author lt
 * @data 4/29 - 15:30
 */

public class ArrayTest {
    public static void main(String[] args) {
        //①二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];
        //正确
        int arr4[][] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
        int arr5[][] = {{1,2,3},{4,5},{6,7,8}};

        //②如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        //③获取数组的长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[1].length);//4

        //④如何遍历二维数组
        //一维数组一层for，二维两层for
        for (int i = 0;i < arr4.length;i++){
            for (int j = 0;j < arr4[i].length;j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
