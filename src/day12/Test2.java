package day12;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author lt
 * @Description 文件字符流
 * @data 8/31 - 9:06
 */
public class Test2 {
    public static void main(String[] args) {
        Test2.testFileReader("F:\\DailyUse\\test\\abc\\tt1.txt");

        Test2.testFileWriter("小黑子食不食油饼","F:\\DailyUse\\test\\abc\\tt5.txt");

        Test2.copyFile("F:\\DailyUse\\test\\abc\\tt5.txt","F:/DailyUse/test/abc/cc/tt5.txt");
    }

    /**
     * 文件字符输入流FileReader
     * @param inPath
     */
    public static void testFileReader(String inPath){
        try {
            FileReader fr = new FileReader(inPath);//创建字符输入流对象

            char[] c = new char[10];//临时存放数据的字符数组

            int len = 0;//输入流的读取长度

            while((len = fr.read(c)) != -1){
                System.out.println(new String(c,0,len));
            }

            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件字符输出流FileWriter
     * @param text 输出内容
     * @param outPath 输出文件
     */
    public static void testFileWriter(String text,String outPath){
        try {
            FileWriter fw = new FileWriter(outPath);
            fw.write(text);//写到内存
            fw.flush();//把内存的数据刷到硬盘
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 字符流完成拷贝文件（只能操作内容是字符的文件）
     * @param inPath
     * @param outPath
     */
    public static void copyFile(String inPath,String outPath){
        try {
            FileReader fr = new FileReader(inPath);
            FileWriter fw = new FileWriter(outPath);

            char[] c = new char[100];

            int len = 0;

            while((len = fr.read(c)) != -1){//读取数据
                fw.write(c,0,len);//写入数据到内容
            }

            fw.flush();
            fw.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
