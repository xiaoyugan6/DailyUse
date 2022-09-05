package day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lt
 * @Description 数据流（专门用来做基本数据类型的读写）
 * @data 9/5 - 15:06
 */

public class Test4 {
    public static void main(String[] args) {
        try {
            Test4.testDataOutputStream();
            Test4.testDataInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据输出流
     * 用数据输出流写到文件中的基本数据类型的数据是乱码的，不能直接辨认出来。需要数据输入流来读取
     */
    public static void testDataOutputStream() throws Exception{
        //查找：ctrl + f
        //替换：ctrl + r
        DataOutputStream out = new DataOutputStream(new FileOutputStream("F:\\DailyUse\\src\\day13\\tt8.txt"));
//        out.writeBoolean(true);
//        out.writeDouble(1.35d);
        out.writeInt(100);

        out.flush();
        out.close();
    }

    /**
     * 数据输入流
     * @throws Exception
     */
    public static void testDataInputStream() throws Exception{
        DataInputStream in = new DataInputStream(new FileInputStream("F:\\DailyUse\\src\\day13\\tt8.txt"));

        System.out.println(in.readInt());

        in.close();
    }
}
