package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lt
 * @Description 编写一个程序，把一个文件复制到指定文件夹下
 * @data 8/30 - 15:35
 */

//in和out是以内存空间为参照物的
//文件读取是数据从文件到内存空间，对内存来说是输入，故为in
//  文件写是数据从内存空间到文件，对内存来说是输出，故为out

//文件字节流非常通用，可以操作任何类型的文件（图片，压缩包等），因为字节流使用的是二进制

//把F:\DailyUse\test\abc\tt1.txt复制到F:\DailyUse\test\abc\cc文件夹下
public class Practise1 {
    public static void main(String[] args) {
        Practise1.copyFile("F:\\DailyUse\\test\\abc\\tt1.txt","F:\\DailyUse\\test\\abc\\cc\\tt1.txt");
        Practise1.copyFile("F:\\DailyUse\\test\\abc\\picture.jpg","F:\\DailyUse\\test\\abc\\cc\\picture.jpg");
    }

    /**
     * 复制文件到指定位置
     * @param inPath 源文件路径
     * @param outPath 复制位置
     */
    public static void copyFile(String inPath,String outPath){
        try {
            FileInputStream in = new FileInputStream(inPath);//读取位置
            FileOutputStream out = new FileOutputStream(outPath);//复制位置
            byte[] b = new byte[100];
            int len = 0;

            while((len = in.read(b)) != -1){
                //写到内存
                out.write(b,0,len);//缓冲数组，数组开始位置写，获取总长度
            }
            out.flush();//把写到内存的数据刷到硬盘
            out.close();//后开先关
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
