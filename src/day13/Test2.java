package day13;

/**
 * @author lt
 * @Description 转换流
 * @data 9/5 - 8:26
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流提供了在字节流和字符流之间的转换
 * Java API提供了两个转换流：
 *      InputStreamReader和OutputStreamWriter
 * 字节流中的数据都是字符时，转成字符流操作更高效。
 */
public class Test2 {
    public static void main(String[] args) {
        //所有的文件都是有编码格式的，对于我们来说，txt和java文件一般来说有三种编码：
        //ISO8859-1,西欧编码，是纯粹英文编码，不适用汉字
        //GBK和UTF-8，这两种编码适用于中文和英文
        //一般使用UTF-8编码
        try {
            Test2.testInputStreamReader();
            Test2.testOutputStreamWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换字节输入流为字符输入流
     * 注意，在转换字符流的时候，参数2要与文件的编码一致，否者会出现乱码
     * @throws Exception
     */
    public static void testInputStreamReader() throws Exception{
        FileInputStream fs = new FileInputStream("F:\\DailyUse\\src\\day13\\tt5.txt");//字节输入流

        //把字节流转换为字符流
        InputStreamReader in = new InputStreamReader(fs,"UTF-8");//参数1是字节流，参数2是编码

        char[] c = new char[100];
        int len = 0;
        while((len = in.read(c)) != -1){
            System.out.println(new String(c,0,len));
        }
        in.close();
        fs.close();
    }

    /**
     * 转换字节输出流为字符输出流
     */
    public static void testOutputStreamWriter() throws Exception{
        FileOutputStream out = new FileOutputStream("F:\\DailyUse\\src\\day13\\tt6.txt");//字节输出流

        OutputStreamWriter os = new OutputStreamWriter(out,"UTF-8");

        os.write("小鱼干");
        os.flush();

        os.close();
        out.close();
    }
}
