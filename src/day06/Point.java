package day06;

/**
 * @author lt
 * @data 7/13 - 10:12
 */
//练习5
//定义一个“点”（Point）类用来便是三位空间中的点(有三个坐标)。要求如下：
//1）可以生成具有tidings坐标的点对象
//2）提供可以设置三个坐标的方法
public class Point {
    public Point(int m,int n,int k){
        x = m;
        y = n;
        z = k;
    }
    int x;
    int y;
    int z;

    public void setPoint(int m,int n,int k){
        x = m;
        y = n;
        z = k;
    }
}
