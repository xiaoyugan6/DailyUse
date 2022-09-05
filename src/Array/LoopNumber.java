package Array;

/**
 * @author lt
 * @data 5/7 - 21:41
 */
//回行数
import java.util.Scanner;

public class  LoopNumber {
    public static void main(String[] args) {
        //获取二维数组大小row，column
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组的行列，用空格隔开：");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        //获取对应二维数组
        int arr[][] = new int[row][column];

        int num = 1;    //起始值
        arr[0][0] = num;
        int max = (row)*(column);   //最大值
        int upBorder = -1;        //上界
        int downBorder = row;     //下界
        int leftBorder = -1;      //左界
        int rightBorder = column; //右界
        int x = 0; //行坐标，当前位置
        int y = 0; //列坐标，当前位置

        //给数组元素赋值
        while(num < max){

            //向右
            //当上临边界 且 y + 1小于右边界，向右
            if(x - 1 == upBorder && y + 1 < rightBorder){
                //赋值
                y++;
                num++;
                arr[x][y] = num;
                //当向右后，y + 1 == 右界时，上界+1
                if(y + 1 == rightBorder){
                    upBorder++;
                }
            }

            //向下
            //当右临边界 && x+1小于下边界，向下
            if(y + 1 == rightBorder && x + 1 < downBorder){
                //赋值
                x++;
                num++;
                arr[x][y] = num;
                //当向下后，x + 1 == 下界时，右界-1
                if(x + 1 == downBorder){
                    rightBorder--;
                }
            }

            //向左
            //当下临边界 && y-1大于左边界，向左
            if(x + 1 == downBorder && y - 1 > leftBorder){
                //赋值
                y--;
                num++;
                arr[x][y] = num;
                //当向左后，y - 1 == 左界时，下界-1
                if(y - 1 == leftBorder){
                    downBorder--;
                }
            }

            //向上
            //当左临边界 && x-1大于上边界，向上
            if(y - 1 == leftBorder && x - 1 > upBorder){
                //赋值
                x--;
                num++;
                arr[x][y] = num;
                //当向上后，x - 1 == 上界时，左界+1
                if(x - 1 == upBorder){
                    leftBorder++;
                }
            }

        }


        //输出数组
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}