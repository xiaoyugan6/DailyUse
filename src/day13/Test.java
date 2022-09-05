package day13;

/**
 * @author lt
 * @Description 缓冲流（把数据缓冲到内存里，在内存中去做io操作，基于内存的io操作大概能比基于硬盘的io操作快75000多倍）
 * @data 9/1 - 8:08
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * FileInputStream,FileOutputStream,FileReader,FileWriter
 * 这些都是计算机与硬盘之间发生的io操作，基于硬盘的读写相对比较慢，受到硬盘读写速度的制约。
 * 为了能够提高读写速度，一定程度上绕过硬盘的限制，java提供一种缓冲流(基于内存)来实现。分别对应
 * BufferedInputStream,BufferedOutputStream,BufferedReader,BufferedWriter
 */

public class Test {
    public static void main(String[] args) {
        try {
            Test.testBufferedInputStream();
            Test.testBufferedOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字节输入流
     */
    public static void testBufferedInputStream() throws Exception {
        //文件字节输入流对象
        FileInputStream in = new FileInputStream("F:\\DailyUse\\src\\day13\\tt.txt");

        //把文件字节输入流放到缓冲字节输入流对象
        BufferedInputStream br = new BufferedInputStream(in);//BufferedInputStream需要InputStream类型的参数或者子类

        byte[] b = new byte[10];
        int len = 0;

        while((len = br.read(b)) != -1){
            System.out.print(new String(b,0,len));
        }
        br.close();
        in.close();

    }

    /**
     * 缓冲字节输出流
     */
    public static void testBufferedOutputStream() throws Exception {
        //创建字节输出流对象
        FileOutputStream out = new FileOutputStream("F:\\DailyUse\\src\\day13\\tt1.txt");

        //把字节输出流对象放到缓冲输出流中
        BufferedOutputStream bo = new BufferedOutputStream(out);

        String s = "xiaoheizi";
        bo.write(s.getBytes());//字符串转换byte数组
        bo.flush();
        bo.close();
        out.close();
    }
}
