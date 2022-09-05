package Array;

/**
 * @author lt
 * @data 5/20 - 14:23
 */
//数组的复制
public class ArrayExer3 {
    public static void main(String[] args) {
        int[] array1,array2;

        array1 = new int[]{2,3,5,7,11,13,17,19};
        //显示array1内容
        for (int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }
        //数组的复制：
        array2 = new int[array1.length];
        for (int i = 0;i < array2.length;i++){
            array2[i] = array1[i];
        }
    }
}
