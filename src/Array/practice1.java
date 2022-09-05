package Array;

/**
 * @author lt
 * @data 5/7 - 21:50
 */
/*
 *算法的考察：求数值型数组中元素的最大值、最小值、平均值、总和等
 *
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数
 * 求出所有元素的最大值、最小值、和值、平均值，并输出
 * 要求：所有随机数都是两位数
 * [10，99]
 * 公式：(int)(Math.random() * (99 - 10 + 1) + 10)
 */
public class practice1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);

            //遍历
            for (int j = 1;j < arr.length;j++){
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
            //求最大值
            int maxValue = arr[0];
            for(int k = 1;k < arr.length;k++){
                if (maxValue < arr[k]){
                    maxValue = arr[k];
                }
            }
            System.out.println("最大值为" + maxValue);
            //求最小值
            int minValue = arr[0];
            for(int m = 1;m < arr.length;m++) {
                if (minValue > arr[m]) {
                    minValue = arr[m];
                }
            }
            System.out.println("最小值为" + minValue);
            //求总和
            int sum = 0;
            for(int n = 0;n < arr.length;n++){
                sum += arr[n];
            }
            System.out.println("总和为" + sum);
            //求平均数
            int avgValue = sum / arr.length;
            System.out.println("平均数为：" + avgValue);
        }
    }
}
