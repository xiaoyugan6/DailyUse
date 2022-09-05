package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lt
 * @Description 文件字节流
 * @data 8/30 - 10:14
 */
public class Test1{
    public static void main(String[] args) {
//        Test1.testFileInputStream();
        Test1.testFileOutputStream();
    }

    /**
     * 文件字节输入流FileInputStream
     */
    public static void testFileInputStream(){
        try {
            FileInputStream in = new FileInputStream("F:\\DailyUse\\test\\abc\\tt1.txt");

            byte[] b = new byte[10];//设置byte数组接收读取的文件内容
            int len = 0;//设置读取数据的长度
//            in.read(b);//in.read方法有个返回值，返回读取的数据长度，如果读取到最后一个数据，还会向后读取一个，这时返回值就是-1
            //返回值是-1意味着文件读取完毕

            while((len = in.read(b)) != -1){
                System.out.println(new String(b,0,len));
                //new String(b,0,len)参数1：缓冲数据的数组，参数2：从数组哪个位置开始转换字符串，参数3：总共转化几个字节
            }

            in.close();//流使用完一定要关闭

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字节输出流FileOutputStream
     */
    public static void testFileOutputStream(){
        try {
            FileOutputStream out = new FileOutputStream("F:\\DailyUse\\test\\abc\\tt4.txt");//指定向tt4输出数据
            String str = "cantiaoraplanqiu";
            out.write(str.getBytes());//把数据写到内存
            out.flush();//把内存中的数据刷写道硬盘
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
